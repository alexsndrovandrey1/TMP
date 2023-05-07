package Builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void builderName() {
        website.setName("Visit Card");
    }

    @Override
    void builderCms() {
        website.setCms(Cms.WORDPRESS);

    }

    @Override
    void builderPrice() {
        website.setPrice(500);

    }
}
