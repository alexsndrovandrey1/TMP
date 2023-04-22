package Iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "C#", "Python", };

        JavaDeveloper javaDeveloper = new JavaDeveloper("Andrey Alexsandrov", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
