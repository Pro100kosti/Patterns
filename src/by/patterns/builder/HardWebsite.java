package by.patterns.builder;

public class HardWebsite extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Hard web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.HARD);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
