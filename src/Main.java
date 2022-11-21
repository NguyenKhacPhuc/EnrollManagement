import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnrolmentManager enrolmentManager = new EnrolmentManager();
        List<Student> studentList = new ArrayList<Student>();
        List<Module> moduleList = new ArrayList<Module>();


        Scanner sc = new Scanner(System.in);
//        int codeModule = 0;
//        for(int i = 0; i <= 3; i++) {
//            codeModule += i + 1;
//            String name = sc.next();
//            int semester = sc.nextInt();
//            int credits = sc.nextInt();
//            CompulsoryModule cm = new CompulsoryModule(String.valueOf("M"+100+codeModule), name, semester, credits);
//            moduleList.add(cm);
//        }


//        for(int i = 0; i <= 2; i++) {
//            codeModule += i+1;
//            String name = sc.next();
//            int semester = sc.nextInt();
//            int credits = sc.nextInt();
//            String departmentName = sc.next();
//            ElectiveModule em = new ElectiveModule(String.valueOf("M"+100+codeModule),name,semester,credits,departmentName);
//            moduleList.add(em);
//        }


        //String id, String name, String dob, String address, String email

//        for(int i = 0; i < 5; i++){
//            int id = 2019;
//            String name = sc.next();
//            String dob = sc.next();
//            String address = sc.next();
//            String email = sc.next();
//
//            Student st = new Student(String.valueOf("S"+id+i),name,dob,address,email);
//            studentList.add(st);
//        }

        //double internalMark, double examinationMark, char finalGrade, double aggregatedMark, Student student, Module module
//        for(int i = 0; i < 10; i++){
//            double internalMark = sc.nextDouble();
//            double examinationMark = sc.nextDouble();
//            char finalGrade = sc.next().charAt(0);
//            double aggregatedMark = internalMark*0.4 + examinationMark*0.6;
//            Enrolment er = new Enrolment(internalMark,examinationMark,finalGrade,aggregatedMark,studentList.get(i),moduleList.get(i));
//
//        }


        CompulsoryModule cm1 = new CompulsoryModule("1", "CTDL", 2, 2);
        CompulsoryModule cm2 = new CompulsoryModule("2", "JAVA", 1, 1);
        CompulsoryModule cm3 = new CompulsoryModule("3", "ATBM", 3, 3);

        ElectiveModule em1 = new ElectiveModule("4","GT1",1,4,"TT");
        ElectiveModule em2 = new ElectiveModule("5","THDC",2,4,"CNTT");

        Student st1 = new Student("1","A","12/12/2001","123","123");
        Student st2 = new Student("2","B","24/01/2001","avd","fsg");
        Student st3 = new Student("3","C","10/11/2001","afas","gfd");
        Student st4 = new Student("4","D","09/12/2001","aa123","dg");
        Student st5 = new Student("5","E","05/06/2001","ssw3","dfg");

        Enrolment er1 = new Enrolment(5.5,6.5,'C',st1,cm1);
        Enrolment er2 = new Enrolment(9.5,8,'C',st2,cm2);
        Enrolment er3 = new Enrolment(5,9,'C',st3,cm2);
        Enrolment er4 = new Enrolment(6,8,'C',st4,cm3);
        Enrolment er5 = new Enrolment(7,7,'C',st5,em1);
        Enrolment er6 = new Enrolment(8,6,'C',st2,em2);
        Enrolment er7 = new Enrolment(9,5,'C',st4,cm1);
        Enrolment er8 = new Enrolment(1,4,'C',st3,cm2);
        Enrolment er9 = new Enrolment(2,3,'C',st5,em2);
        Enrolment er10 = new Enrolment(3,1,'C',st1,em1);

        enrolmentManager.addEnrolment(er1);
        enrolmentManager.addEnrolment(er2);
        enrolmentManager.addEnrolment(er3);
        enrolmentManager.addEnrolment(er4);
        enrolmentManager.addEnrolment(er5);
        enrolmentManager.addEnrolment(er6);
        enrolmentManager.addEnrolment(er7);
        enrolmentManager.addEnrolment(er8);
        enrolmentManager.addEnrolment(er9);
        enrolmentManager.addEnrolment(er10);

//        (c) Print a non-sorted initial report of the enrolments on the standard output
        enrolmentManager.report();

//        (d) Print a sorted initial report of the enrolments on the standard output
        enrolmentManager.sort();
        enrolmentManager.report();
//        (e) Initialise and enter marks for 5 enrolments
//        (f) Print a (sorted) assessment report of the enrolments on the standard output
//        (g) End the program



    }
}