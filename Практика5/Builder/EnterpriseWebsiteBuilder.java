package Builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void builderName() {
        website.setName("Enterprise");
    }

    @Override
    void builderCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void builderPrice() {
        website.setPrice(5000);
    }
}
