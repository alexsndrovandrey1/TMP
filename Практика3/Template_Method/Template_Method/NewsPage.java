package Template_Method;

public class NewsPage extends WebsiteTemplate {
    @Override
    public void showPageContent(){
        System.out.println("Новости");
    }
}
