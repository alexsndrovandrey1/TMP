package Strategy;

public class Student {
    Activity activity;
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void executeActivity() {
        activity.justDoIt();
    }
}
