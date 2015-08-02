package Assignment2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import static Assignment2.CrawlerGUI.jTable1;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suan Yan Ng
 */
public class CrawlerUser {

    //private LinkedList<String> URLs, crawledURLsMain;
    private LinkedList<String> sharedList;

    /*public LinkedList<String> getSharedItem() {
     return sharedItem;
     }*/
    public LinkedList<String> getCrawledURLs() {
        System.out.println("Get" + Thread.currentThread());
        return sharedList;
    }

    public int addCrawledURLs(ArrayList<String> crawledURLs) {
        System.out.println("Set" + Thread.currentThread());
        int addedValues = 0;
        for (String link : crawledURLs) {
            if (!sharedList.contains(link) && !link.isEmpty()) {
                sharedList.add(link);
                addedValues++;
            }
        }
        return addedValues;
    }

    public CrawlerUser() {
        sharedList = new LinkedList<String>();
    }

    /*public LinkedList<String> grabURLs() {
        LinkedList<String> URLs = new LinkedList<String>();
        try {
            PageRead PR = new PageRead();
            URLs = PR.getUrls("Item");
            int failTimes = 0;
            int checkSize = URLs.size();
            while (checkSize < 15) {
                LinkedList<String> URLChecker = new LinkedList<String>();
                URLChecker.addAll(URLs);
                Iterator iterate = URLs.iterator();
                while (iterate.hasNext() && checkSize < 15) {
                    Iterator newURLsIterate = PR.getUrls(iterate.next().toString()).iterator();
                    while (newURLsIterate.hasNext() && checkSize < 15) {
                        String link = newURLsIterate.next().toString();
                        System.out.println(link);
                        synchronized (URLs) {
                            if (!URLs.contains(link)) {
                                URLs.add(link.toString());
                                checkSize++;
                            } else {
                                failTimes++;
                            }
                            if (failTimes == 10) {
                                checkSize = 15;
                            }
                        }

                    }
                }
            }
            System.out.println("First thing to do" + Thread.currentThread());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return URLs;
    }*/

    public void addRows() {
        //int newValue = sharedItem;

        //for (int i = 0; i < 10000; i++) {
        //} //Simulate complex calculations

        //sharedItem = newValue + 1;
        //System.out.println(Thread.currentThread().getName() + " running. Value: " + sharedItem);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //model.setNumRows(0);
        Collections.sort(sharedList);
        System.out.println("Here" + sharedList.isEmpty());
        int count = 0;
        for (String urlcrawler : sharedList) {
            if (count < 15) {
                model.addRow(new Object[]{urlcrawler});
                System.out.println(count);
                count++;
            }
        }
        System.out.println(Thread.currentThread());
    }
}
