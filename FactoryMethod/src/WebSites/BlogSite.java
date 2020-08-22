package WebSites;

import Pages.AboutPage;
import Pages.PostPage;

public class BlogSite extends WebSite {
    @Override
    public void createWebSite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
    }
}
