package studentdatabaseapplication;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tutionBalance =0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public int getTutionBalance() {
        return tutionBalance;
    }

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Name - ");
        this.firstName = sc.nextLine();
        System.out.println("Enter your Last Name - ");
        this.lastName = sc.nextLine();
        System.out.println("Enter your grade year - ");
        this.gradeYear = sc.nextInt();
        setStudentId();
        System.out.println("studentdatabaseapplication.Student details are "+firstName+" "+lastName+" "+gradeYear+" "+studentId);
    }

    private void setStudentId(){
        id++;
        this.studentId = gradeYear +""+ id;
    }

    public void enroll(){
        int courseFees = 600;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter subjects to enroll or press Q to exit");
        String choice = sc.nextLine();
        String[] subjects = choice.split(" ");

        for (String subject:subjects
             ) {
            if(!subject.equalsIgnoreCase("Q")){
                tutionBalance = tutionBalance+ courseFees;
                courses = courses+subject;
            }
            else{
                System.out.println("exiting");
                return;
            }

        }



    }

    public void enroll1(){
        int courseFees = 600;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter subjects to enroll or press Q to exit");
        String choice = null;

        while(1 != 0){
         choice   = sc.nextLine();
            if(choice != null && !choice.equalsIgnoreCase("Q")){
                tutionBalance = tutionBalance+ courseFees;

            }
            else{
                System.out.println("exiting");
                return;
            }

        }

    }



    }


