package Activity1;

public class JavaCourse implements Course {
    private String name;
    private String courseCode;
    private int credits;

    public JavaCourse(String name, String  courseCode, int credits) {
        this.name = name;
        this.credits = credits;
        this.courseCode = courseCode;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getCoureCode() {
        return courseCode;
    }
    @Override
    public int getCredits() {
        return credits;
    }
}