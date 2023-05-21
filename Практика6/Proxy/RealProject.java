package Proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Загрузка проекта с " + url + "..." );
    }
    @Override
    public void run() {
        System.out.println("Запуск проекта с " + url + "...");
    }

}
