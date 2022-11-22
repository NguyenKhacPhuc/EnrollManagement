/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment.pkg1.oop;

/**
 *
 * @author Admin
 */
public class enrolment {
    private Student student;
    private module module;
    private float internalMark;
    private float examinationMark;
     private char finalGrade;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public module getModule() {
        return module;
    }

    public void setModule(module module) {
        this.module = module;
    }

    public float getInternalMark() {
        return internalMark;
    }

    public void setInternalMark(float internalMark) {
        this.internalMark = internalMark;
    }

    public float getExaminationMark() {
        return examinationMark;
    }

    public void setExaminationMark(float examinationMark) {
        this.examinationMark = examinationMark;
    }

    public char getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(char finalGrade) {
        this.finalGrade = finalGrade;
    }

    public enrolment(Student student, module module, float internalMark, float examinationMark, char finalGrade) {
        this.student = student;
        this.module = module;
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
        this.finalGrade = finalGrade;
    }
    public void aggregatedMark(){
        float aggregatemark = (float) (internalMark * 0.4 + examinationMark *0.6);
        System.out.println(aggregatemark);
    }
   public void finalMarkDisplay( ){
       
}
}
