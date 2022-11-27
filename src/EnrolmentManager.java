import java.util.*;
public class EnrolmentManager {
    private ArrayList<Enrolment> enrolmentArrayList;

    public EnrolmentManager() {
        this.enrolmentArrayList = new ArrayList<Enrolment>();
    }

    public EnrolmentManager(ArrayList<Enrolment> enrolmentArrayList) {
        this.enrolmentArrayList = enrolmentArrayList;
    }

    public void addEnrolment(Enrolment enrolment){
        if (enrolment == null) {
            System.out.println("Dữ liệu không hợp lệ hoặc đã tồn tại");
        }
        this.enrolmentArrayList.add(enrolment);
        System.out.println("Added ");
    //adds a new enrolment
    }

    public Enrolment getEnrolment (Student student, Module module){
        for(int i = 0; i < enrolmentArrayList.size(); i++) {
            if (enrolmentArrayList.get(i).getStudent() == student && enrolmentArrayList.get(i).getModule() == module)
                return enrolmentArrayList.get(i);
        }
        return null;
    //returns the enrolment of the specified student and module
    }

    public void setMarks(Student student, Module module, double internalMark, double examinationMark){
        for(int i = 0; i < enrolmentArrayList.size(); i++) {
            if (enrolmentArrayList.get(i).getStudent() == student && enrolmentArrayList.get(i).getModule() == module)
                enrolmentArrayList.get(i).setInternalMark(internalMark);
                enrolmentArrayList.get(i).setExaminationMark(examinationMark);
        }

    //records the internal and examination marks (in that order) into the enrolment of the specified module of the given student
    }

    public void report(){
        System.out.println("------------------------------");
        for(int i = 0; i < enrolmentArrayList.size(); i++) {
            System.out.println(enrolmentArrayList.get(i).getStudent().getName()+ " " + enrolmentArrayList.get(i).getStudent().getId() + " " + enrolmentArrayList.get(i).getStudent().getDob() + " " + enrolmentArrayList.get(i).getModule().getName()+ " " + enrolmentArrayList.get(i).getModule().getCode()+ " "  + enrolmentArrayList.get(i).getFinalGrade());
        }
        System.out.println("------------------------------");

    }


    public String reportAssesment(){
        System.out.println("------------------------------");
        for(int i = 0; i < enrolmentArrayList.size(); i++) {
            return enrolmentArrayList.get(i).getInternalMark() + String.valueOf(enrolmentArrayList.get(i).getExaminationMark()) + enrolmentArrayList.get(i).getFinalGrade();
        }
        return "------------------------------";
    //generates an assessment report of all the enrolments together with their internal, exam marks and final grade
    }

    public void sort(){
            Collections.sort(enrolmentArrayList, new Comparator<Enrolment>() {
                @Override
                public int compare(Enrolment enrolment1, Enrolment enrolment2)
                {

                    return enrolment1.getStudent().getName().compareTo(enrolment2.getStudent().getName());

                }
            });

    }

}
