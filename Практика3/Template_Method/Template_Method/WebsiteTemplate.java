package Template_Method;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Верхний колонтитул");
        showPageContent();
        System.out.println("Нижний колонтитул");
    }
    public abstract void showPageContent();

}
