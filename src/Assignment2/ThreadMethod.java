
package Assignment2;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadMethod extends Thread {
    //Once submit, start thread.
    CrawlerUser crawler;
    String URL;
    
    public ThreadMethod(CrawlerUser crawler, String URL) {
        this.crawler = crawler;
        this.URL = URL;
    }
    
    public ThreadMethod(CrawlerUser crawler) {
        this.crawler = crawler;
        URL = "";
    }
    
    public Pair getDeeperURLs(ArrayList<String> upperLevelURLs) throws IOException {
        ArrayList<String> lowerLevelURLs = new ArrayList<String>();
        int addedRecords = 0;
        for (String link : upperLevelURLs) {
            lowerLevelURLs = new PageRead().getUrls(link);
            addedRecords = crawler.addCrawledURLs(lowerLevelURLs);
            if (crawler.getCrawledURLs().size() >= 15) {
                break;
            }
        }
        return new Pair(lowerLevelURLs, addedRecords);
    }
    
    public void run() {
        try {
            if (URL.isEmpty()) {
                LinkedList<String> sharedList = new LinkedList<String>();
                do {
                    sharedList = crawler.getCrawledURLs();
                    Collections.reverse(sharedList);
                    if (sharedList.isEmpty()) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ThreadMethod.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } while (sharedList.isEmpty());
                ArrayList<String> duplicatedList = new ArrayList<String>();
                for (String link : sharedList) {
                    duplicatedList.add(link);
                }
                while (sharedList.size() < 15) {
                    Pair p = getDeeperURLs(duplicatedList);
                    duplicatedList = p.lowerLevelURLs;
                    if (p.addedRecords == 0) {
                        break;
                    }
                }
            } else {
                PageRead pr = new PageRead();
                ArrayList<String> linkURLs = pr.getUrls(URL);
                crawler.addCrawledURLs(linkURLs);
                LinkedList<String> sharedList = crawler.getCrawledURLs();
                while (sharedList.size() < 15) {
                    Pair p = getDeeperURLs(linkURLs);
                    linkURLs = p.lowerLevelURLs;
                    if (p.addedRecords == 0) {
                        break;
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ThreadMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private class Pair {
        private ArrayList<String> lowerLevelURLs;
        private int addedRecords;
        
        public Pair(ArrayList<String> lowerLevelURLs, int addedRecords) {
            this.lowerLevelURLs = lowerLevelURLs;
            this.addedRecords = addedRecords;
        }
    }
}
