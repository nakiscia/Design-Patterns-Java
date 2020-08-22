package WebSites;

public class WebSiteFactory {
    public static WebSite getWebSite(String siteType){
        switch (siteType){
            case "BLOG":
                return new BlogSite();
            case "SHOP":
                return new ShopSite();
            default:
                return null;
        }
    }
}
