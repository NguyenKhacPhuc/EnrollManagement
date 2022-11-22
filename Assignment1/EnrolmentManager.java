package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EnrolmentManager {
	private ArrayList<Enrolment> list;

	public EnrolmentManager(ArrayList<Enrolment> list) {
		this.list = list;
	}

	public EnrolmentManager() {
		this.list = new ArrayList<Enrolment>();
	}

	public void addEnrolment(Enrolment enrol) {
		this.list.add(enrol);
	}

	public String report() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getStudent());
			System.out.println(list.get(i).getModule());
		}
		return null;
	}

	public String reportAssessment() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getStudent());
			System.out.println(list.get(i).getModule());
			System.out.println(list.get(i).getInternalMark());
			System.out.println(list.get(i).getExaminationMark());
			list.get(i).Grade();
		}
		return null;
	}

	public void sortById() {
		Comparator<Enrolment> comparator = (Comparator.comparing(Enrolment::checkId)).reversed();
		Collections.sort(list, comparator);
	}

}
