package oop.assignment1;

public class Student {

    private static int count = 2019;
    private String id;
    private String studentName;
    private String dob;
    private String address;
    private String email;

    public Student(String studentName, String dob, String address, String email) {
        setId("S" + (count++));
        this.studentName = studentName;
        this.dob = dob;
        this.address = address;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public boolean setStudentName(String studentName) {
        if (studentName != null) {
            this.studentName = studentName;
            return true;
        } else {
            return false;
        }
    }

    public String getDob() {
        return dob;
    }

    public boolean setDob(String dob) {
        if (dob != null) {
            this.dob = dob;
            return true;
        } else {
            return false;
        }
    }

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        if (address != null) {
            this.address = address;
            return true;
        } else {
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + getId() + '\'' +
                ", studentName='" + studentName + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
