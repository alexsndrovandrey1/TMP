package Strategy;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();

        student.setActivity(new Sleeping());
        student.executeActivity();

        student.setActivity(new Training());
        student.executeActivity();

        student.setActivity(new Studying_at_the_University());
        student.executeActivity();

        student.setActivity(new Doing_Homework());
        student.executeActivity();

        student.setActivity(new Walk());
        student.executeActivity();

        student.setActivity(new Sleeping());
        student.executeActivity();
    }
}
