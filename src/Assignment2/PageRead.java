package Assignment2;



import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PageRead  {
       LinkedList<String> UrlsSourceCode=new LinkedList<>();

       
    public void storeUrlSourceCode(LinkedList<String>storedUrls)throws IOException{

        for(String storedUrl:storedUrls){            
        Document doc = Jsoup.connect(storedUrl).get();
   UrlsSourceCode.add(doc.getAllElements().toString());
        }


}
    public ArrayList<String> getUrlText(String Url) throws IOException{
        Document doc = Jsoup.connect(Url).get();     
      
        Elements paragraphs = doc.select("p");
        ArrayList<String> Texts = new ArrayList<>();
        for (Element paragraph : paragraphs) {
            Texts.add(paragraph.text());

        }
    return Texts;
    }
public ArrayList<String> getUrls(String storedUrl) throws IOException{
    ArrayList<String> CrawledUrls=new ArrayList<String>();
        Document doc = Jsoup.connect(storedUrl).get();
        Elements anchors = doc.select("a[href]");
    for(Element anchor:anchors){
        CrawledUrls.add(anchor.attr("abs:href")); //abs: return the absolute path if path is relative
    }
    return CrawledUrls;
}
 
}
