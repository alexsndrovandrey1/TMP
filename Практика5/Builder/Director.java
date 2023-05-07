package Builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }
    Website buildWebsite(){
        builder.createWebsite();
        builder.builderName();
        builder.builderCms();
        builder.builderPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
