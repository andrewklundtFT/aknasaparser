package edu.francistuttle;

import java.io.File;
import java.net.URL;
import java.util.List;

import com.sun.syndication.feed.synd.SyndCategoryImpl;
import com.sun.syndication.feed.synd.SyndContentImpl;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndLinkImpl;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        //File nasaXML = new File("C:\\Users\\ak1036178\\Desktop\\Hitgub\\aknasaparser\\src\\nasa.xml");
        URL nasaURL = new URL("https://www.nasa.gov/rss/dyn/breaking_news.rss");
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(nasaURL));
        
        System.out.println("Feed Title: " + feed.getTitle());
        System.out.println("Link: " + feed.getLink());
        System.out.println("Description: " + feed.getDescription());
        for (SyndEntry item : (List<SyndEntry>) feed.getEntries()) {
            System.out.println("\tStory title: " + item.getTitle());
            System.out.println("\t\tLink: " +  item.getLink());
        }
    }
}
