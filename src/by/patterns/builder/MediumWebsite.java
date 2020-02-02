package by.patterns.builder;

public class MediumWebsite extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Medium web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.MEDIUM);
    }

    @Override
    void buildPrice() {
        website.setPrice(5000);
    }
}
