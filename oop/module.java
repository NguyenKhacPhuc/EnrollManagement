/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment.pkg1.oop;

/**
 *
 * @author Admin
 */
public class module {
    private String code;
    private String name;
    private int semester;
    private int credits;

    public module(String code, String name, int semester, int credits) {
        this.code = code;
        this.name = name;
        this.semester = semester;
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void moduleCode(){
        int i = 0;
            if(semester == 2){
                System.out.println("M"+ 2*100 +i);
            }else if(semester == 1){
                System.out.println("M" + 1*10 +i);
        }
    }
        
    
}
