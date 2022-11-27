package oop.assignment1;

public class Enrolment {
    private Student student;
    private Module module;
    private float internalMark;
    private float examinationMark;
    private String finalGrade;

    public Enrolment(Student student, Module module, float internalMark, float examinationMark, String finalGrade) {
        this.student = student;
        this.module = module;
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
        this.finalGrade = finalGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public float getInternalMark() {
        return internalMark;
    }

    public boolean setInternalMark(float internalMark) {
        if (internalMark >= 0 && internalMark <= 10.0) {
            this.internalMark = internalMark;
            return true;
        } else {
            return false;
        }
    }

    public float getExaminationMark() {
        return examinationMark;
    }

    public boolean setExaminationMark(float examinationMark) {
        if (examinationMark >= 0 && examinationMark <= 10.0) {
            this.examinationMark = examinationMark;
            return true;
        } else {
            return false;
        }
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void finalGradeFormula() {
        float finalMark = (float) (0.4 * getInternalMark() + 0.6 * getExaminationMark());
        if (finalMark >= 0 && finalMark <= 2.5) {
            System.out.println("F");
        } else if (finalMark > 2.5 && finalMark <= 5.0) {
            System.out.println("p");
        } else if (finalMark > 5.0 && finalMark <= 7.5) {
            System.out.println("G");
        } else {
            System.out.println("E");
        }
    }

    @Override
    public String toString() {
        return "Enrolment{" +
                "student=" + student +
                ", module=" + module +
                ", internalMark=" + internalMark +
                ", examinationMark=" + examinationMark +
                ", finalGrade='" + finalGrade + '\'' +
                '}';
    }
}
