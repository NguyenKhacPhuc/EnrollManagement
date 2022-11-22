/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment.pkg1.oop;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        EnrolmentManager enrolmentManager = new EnrolmentManager();
         Student student1 = new Student("Hai", "1206", "Ha Noi", "hai@gmail.com");
//        Student student2 = new Student("Nam", "2112", "Lao Cai", "nam@gmail.com");
//        Student student3 = new Student("Tien", "0912", "Thanh Hoa", "tien@gmail.com");
//        Student student4 = new Student("Long", "1703", "Ha Noi", "long@gmail.com");
//        Student student5 = new Student("Trung", "1102", "Ha Noi", "trung@gmail.com");
//
        compulsoryModule compulsoryModule1 = new compulsoryModule("Math",1,3);
//        CompulsoryModule compulsoryModule2 = new CompulsoryModule("Physics",1,4);
//        CompulsoryModule compulsoryModule3 = new CompulsoryModule("PE",2,2);
//
//        ElectiveModule electiveModule1 = new ElectiveModule("ABC",1,3,"ABuilding");
//        ElectiveModule electiveModule2 = new ElectiveModule("ABCDE",2,3,"BBuilding");
 enrolment e1 = new enrolment(student1,compulsoryModule1,3.2f,3.2f,'A');
 enrolmentManager.addEnrolment(e1);
 enrolmentManager.reportAssessment();
 enrolmentManager.report();
 
    }
}
