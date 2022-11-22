/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment.pkg1.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class EnrolmentManager {
    private ArrayList<enrolment> Enrolmentlist;

    public EnrolmentManager(ArrayList<enrolment> Enrolmentlist) {
        this.Enrolmentlist = Enrolmentlist;
    }

    EnrolmentManager() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void addEnrolment(enrolment enrolment){
        this.Enrolmentlist.add(enrolment);
    }
    public enrolment getEnrolment(Student student, module module){
        for(int i = 0; i < Enrolmentlist.size();i++){    
           if(Enrolmentlist.get(i).getStudent() == student && Enrolmentlist.get(i).getModule() == module){
              
           }
            return getEnrolment(student, module);
        }
        return null;
    } 
    public void setMark(Student student, module module, double internalMark, double examinationMark){
        for(int i = 0; i < Enrolmentlist.size(); i++) {
            if (Enrolmentlist.get(i).getStudent() == student && Enrolmentlist.get(i).getModule() == module)
                Enrolmentlist.get(i).setInternalMark((float) internalMark);
                Enrolmentlist.get(i).setExaminationMark((float) examinationMark);
        }

    }
    public String report(){
      for(int i = 0; i <Enrolmentlist.size();i++){
          System.out.println(Enrolmentlist.get(i).getStudent() + " " + Enrolmentlist.get(i).getModule());
      }
        return null;
        
    }
    public float reportAssessment(){
         for(int i = 0; i <Enrolmentlist.size();i++){
              return Enrolmentlist.get(i).getInternalMark() + Enrolmentlist.get(i).getExaminationMark() + Enrolmentlist.get(i).getFinalGrade();
      }
        return 0;   
    }
    public void sort(){
         Collections.sort(Enrolmentlist, new Comparator<enrolment>() {
            @Override
            public int compare(enrolment e1, enrolment e2) {
               return e1.getStudent().getName().compareTo(e2.getStudent().getName());
            }
    });
                 }
//getter and setter
    public ArrayList<enrolment> getEnrolmentlist() {
        return Enrolmentlist;
    }

    public void setEnrolmentlist(ArrayList<enrolment> Enrolmentlist) {
        this.Enrolmentlist = Enrolmentlist;
    }
    
}
