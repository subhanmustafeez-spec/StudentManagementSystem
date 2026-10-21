package main;

import student.Student;
import course.Course;
import enrollment.Enrollment;
import payment.PaymentMethod;
import payment.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("STUDENT MANAGEMENT SYSTEM INITIALIZED");
                System.out.println("==========================================");
// Instantiating Student and Course objects
        Student student1 = new Student("SE-02093", "Subhan Mustafeez",
                "f24bseen1e02093@iub.edu.pk");
        Course course1 = new Course("SE-301", "Software Construction", 4);
        student1.displayProfile();
        course1.displayCourseInfo();
// Enrolling Student into Course
        Enrollment currentEnrollment = new Enrollment(student1, course1);
        currentEnrollment.printEnrollmentSummary();
// Processing Fee Payment via Interface
        System.out.println("\n[System] Initiating Fee Payment...");
        PaymentMethod payment = new CreditCardPayment("5678-2352-3242-4565");
        boolean paymentSuccess = payment.pay(69000.00);
        if (paymentSuccess) {
            currentEnrollment.completeEnrollment();
            currentEnrollment.printEnrollmentSummary();
        }
    }
}