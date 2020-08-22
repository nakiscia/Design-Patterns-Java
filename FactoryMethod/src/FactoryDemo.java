import WebSites.WebSite;
import WebSites.WebSiteFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        WebSite webSite = WebSiteFactory.getWebSite("BLOG");
        System.out.println(webSite.getPages());

        WebSite webSite2 = WebSiteFactory.getWebSite("SHOP");
        System.out.println(webSite2.getPages());
    }
}
