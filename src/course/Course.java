package course;
public class Course {
    private final String courseCode;
    private final String courseTitle;
    private final int creditHours;
    public Course(String courseCode, String courseTitle, int creditHours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseTitle() {
        return courseTitle;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void displayCourseInfo() {
        System.out.println("[Course] " + courseCode + " - " + courseTitle + " (" +
                creditHours + " Credit Hours)");
    }

}