package WebSites;

import Pages.AboutPage;
import Pages.CartPage;

public class ShopSite extends WebSite {

    @Override
    public void createWebSite() {
        pages.add(new CartPage());
        pages.add(new AboutPage());
    }
}
