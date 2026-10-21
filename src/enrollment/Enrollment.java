package enrollment;
import student.Student;
import course.Course;
public class Enrollment {
    private final Student student;
    private final Course course;
    private boolean isPaid;

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.isPaid = false;
    }
    public void completeEnrollment() {
        this.isPaid = true;
        System.out.println("Enrollment completed for " + student.getFullName() + " in " + course.getCourseTitle() + ".");
    }
    public void printEnrollmentSummary() {
        System.out.println("----------------------------------------");
        System.out.println("ENROLLMENT SUMMARY");
        System.out.println("Student: " + student.getFullName() + " (" +
                student.getStudentId() + ")");
        System.out.println("Course:  " + course.getCourseTitle() + " [" +
                course.getCourseCode() + "]");
        System.out.println("Status:  " + (isPaid ? "FEES PAID / ACTIVE" : "PENDING PAYMENT"));
                System.out.println("----------------------------------------");
    }
}