package SiteIdentifier;


import java.util.ArrayList;

public class KnownSites {

    private ArrayList<String> al = new ArrayList<String>();
    private String[] urls = {"google.com", "sighb.org", "well.com", "fish.net"};

    public KnownSites() {
        for (String url : urls) {
            al.add(url);
        }
    }

    public boolean isKnown(String url) {
        return al.contains(url);
    }
} //class
