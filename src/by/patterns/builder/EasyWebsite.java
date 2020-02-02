package by.patterns.builder;

public class EasyWebsite extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("easy web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.EASY);
    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }
}
