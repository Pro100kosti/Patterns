package by.patterns.builder;

public class Website {
    private String name;
    private Cms cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website:\n" +
                "Name = " + name +
                ", \nCms = " + cms +
                ", \nPrice = " + price;
    }
}
