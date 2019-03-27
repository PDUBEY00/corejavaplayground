package studentdatabaseapplication;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.enroll1();
        System.out.println("tution fees for the student is "+student.getTutionBalance());
    }
}
