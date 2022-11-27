package oop.assignment1;

public class Main {
    public static void main(String[] args) {
        EnrolmentManager enrolmentList = new EnrolmentManager();

        Student student1 = new Student("Hai", "1206", "Ha Noi", "hai@gmail.com");
        Student student2 = new Student("Nam", "2112", "Lao Cai", "nam@gmail.com");
        Student student3 = new Student("Tien", "0912", "Thanh Hoa", "tien@gmail.com");
        Student student4 = new Student("Long", "1703", "Ha Noi", "long@gmail.com");
        Student student5 = new Student("Trung", "1102", "Ha Noi", "trung@gmail.com");

        CompulsoryModule compulsoryModule1 = new CompulsoryModule("Math",1,3);
        CompulsoryModule compulsoryModule2 = new CompulsoryModule("Physics",1,4);
        CompulsoryModule compulsoryModule3 = new CompulsoryModule("PE",2,2);

        ElectiveModule electiveModule1 = new ElectiveModule("ABC",1,3,"ABuilding");
        ElectiveModule electiveModule2 = new ElectiveModule("ABCDE",2,3,"BBuilding");

        Enrolment e1 = new Enrolment(student1,compulsoryModule1,3.2f,3.2f,"A");
        Enrolment e2 = new Enrolment(student3,compulsoryModule2,3.2f,3.2f,"A");
        Enrolment e3 = new Enrolment(student2,compulsoryModule3,3.2f,3.2f,"A");
        enrolmentList.addEnrolment(e1);
        enrolmentList.addEnrolment(e2);
        enrolmentList.addEnrolment(e3);
//        enrolmentList.setMarks(student1,compulsoryModule1,2.0f,2.0f);
//        enrolmentList.sort();
//        enrolmentList.report();
        enrolmentList.reportAssessment();
//        enrolmentList.getEnrolment(student1,compulsoryModule1);
        System.out.println();
    }
}
