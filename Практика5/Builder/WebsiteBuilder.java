package Builder;

public abstract class WebsiteBuilder {
    Website website;

    void  createWebsite(){
        website = new Website();
    }

    abstract void builderName();
    abstract void builderCms();
    abstract void builderPrice();

    Website getWebsite() {
        return website;
    }
}
