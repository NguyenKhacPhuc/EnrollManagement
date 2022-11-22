package Assignment1;

public class CourseManProg {
	public static void main(String[] args) {
		EnrolmentManager EnM = new EnrolmentManager();
		Student st1 = new Student("2019", "Le", "17/10/2001", "HN", "le@gmail.com");
		Student st2 = new Student("2020", "Dinh", "18/10/2001", "NA", "dinh@gmail.com");
		Student st3 = new Student("2021", "Hoang", "19/10/2001", "NB", "hoang@gmail.com");
		Student st4 = new Student("2022", "Anh", "20/10/2001", "TH", "anh@gmail.com");

		CompulsoryModule mo1 = new CompulsoryModule("T1", "IT1", 2);
		CompulsoryModule mo2 = new CompulsoryModule("T2", "IT2", 2);
		CompulsoryModule mo3 = new CompulsoryModule("T3", "IT3", 2);

		Enrolment e1 = new Enrolment(st1, mo1, 2.0, 5.0);
		Enrolment e2 = new Enrolment(st2, mo2, 7.0, 5.0);
		Enrolment e3 = new Enrolment(st3, mo3, 7.0, 8.0);
		Enrolment e4 = new Enrolment(st4, mo2, 9.0, 9.0);

		System.out.println("Information about enrol");
		EnM.addEnrolment(e1);
		EnM.addEnrolment(e3);
		EnM.addEnrolment(e2);
		EnM.addEnrolment(e4);
		EnM.report();

		System.out.println("---------------");
		System.out.println("Print all information about enrol");
		EnM.reportAssessment();

		System.out.println("---------------");
		System.out.println("Sort by ID");
		EnM.sortById();
		EnM.report();

	}

}
