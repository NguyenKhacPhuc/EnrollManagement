package oop.assignment1;

public class ElectiveModule extends Module {
    private String departmentName;

    public ElectiveModule(String moduleName, int semester, int credit, String departmentName) {
        super(moduleName, semester, credit);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public boolean setDepartmentName(String departmentName) {
        if (departmentName != null) {
            this.departmentName = departmentName;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "departmentName='" + departmentName + '\'' + '}';
    }
}
