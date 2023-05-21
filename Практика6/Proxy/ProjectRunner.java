package Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new RealProject("https://github.com/alexsndrovandrey1/TMP");

        project.run();
    }
}
