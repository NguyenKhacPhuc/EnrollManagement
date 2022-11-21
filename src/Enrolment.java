public class Enrolment {
    private double internalMark;
    private double examinationMark;
    private char finalGrade;
    private double aggregatedMark = internalMark*0.4 + examinationMark*0.6;
    private Student student;
    private Module module;


    public Enrolment(double internalMark, double examinationMark, char finalGrade, Student student, Module module) {
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
        this.finalGrade = finalGrade;
        this.aggregatedMark = aggregatedMark;
        this.student = student;
        this.module = module;
    }

    public double getInternalMark() {
        return internalMark;
    }

    public void setInternalMark(double internalMark) {
        this.internalMark = internalMark;
    }

    public double getExaminationMark() {
        return examinationMark;
    }

    public void setExaminationMark(double examinationMark) {
        this.examinationMark = examinationMark;
    }

    public char getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(char finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getAggregatedMark() {
        return aggregatedMark;
    }

    public void setAggregatedMark(double aggregatedMark) {
        this.aggregatedMark = aggregatedMark;
    }



    public Student getStudent(){
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


}
