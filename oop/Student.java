/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment.pkg1.oop;

/**
 *
 * @author Admin
 */
public class Student {
    private String id;
    private String name;
    private String dob;
    private String address;
//    private int year;

    public Student(String id, String name, String dob, String address, int year) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
//        this.year = year;
    }

    Student(String hai, String string, String ha_Noi, String haigmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
    public void idCode(int year){
        System.out.println("S" + year);
    }

   
}
