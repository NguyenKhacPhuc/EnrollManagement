package oop.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EnrolmentManager {
    private ArrayList<Enrolment> enrolmentArrayList;

    public EnrolmentManager() {
        this.enrolmentArrayList = new ArrayList<Enrolment>();
    }

    public EnrolmentManager(ArrayList<Enrolment> enrolmentArrayList) {
        this.enrolmentArrayList = enrolmentArrayList;
    }

    //adds a new enrolment
    public void addEnrolment(Enrolment enrolment) {
        this.enrolmentArrayList.add(enrolment);
    }

    //returns the enrolment of the specified
    //student and module
    public Enrolment getEnrolment(Student student, Module module) {
        for (int i = 0; i < enrolmentArrayList.size(); i++) {
            boolean check = enrolmentArrayList.get(i).getStudent().equals(student) && enrolmentArrayList.get(i).getModule().equals(module);
            if (check) {
                return enrolmentArrayList.get(i);
            }
        }
        return null;
    }

    // records the internal and examination marks
    //(in that order) into the enrolment of the specified module of the given student
    public void setMarks(Student student, Module module, double internalMark, double examminationMark) {
        for (int i = 0; i < enrolmentArrayList.size(); i++) {
            boolean check = enrolmentArrayList.get(i).getStudent().equals(student) && enrolmentArrayList.get(i).getModule().equals(module);
            if (check) {
                enrolmentArrayList.get(i).setInternalMark((float) internalMark);
                enrolmentArrayList.get(i).setExaminationMark((float) examminationMark);
            }
        }
    }

    //    generates an initial report of all the current enrolments (without marks)
//    in the program
    public String report() {
        for (int i = 0; i < enrolmentArrayList.size(); i++) {
            System.out.println(enrolmentArrayList.get(i).getStudent());
            System.out.println(enrolmentArrayList.get(i).getModule());
        }
        return null;
    }


    //generates an assessment report of all the enrolments together
    //with their internal, exam marks and final grade
    public String reportAssessment() {
        for (int i = 0; i < enrolmentArrayList.size(); i++) {
            System.out.println("Internal mark: " + enrolmentArrayList.get(i).getInternalMark() + "\nExamination mark: " + enrolmentArrayList.get(i).getExaminationMark() + "\nFinal grade: " + enrolmentArrayList.get(i).getFinalGrade());
        }
        return null;
    }

    //sorts the current enrolments in the descending order of the student identifier(name)
    public void sort() {
        Collections.sort(enrolmentArrayList, new Comparator<Enrolment>() {
            @Override
            public int compare(Enrolment e1, Enrolment e2) {
                int compare = e1.getStudent().getStudentName().compareTo(e2.getStudent().getStudentName());
                if (compare >= 0) {
                    return 1;
                }
                return -1;
            }
        });
    }


}
