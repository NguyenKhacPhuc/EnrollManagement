public class ElectiveModule extends Module{
    private String departmentName;

    public ElectiveModule(String code, String name, int semester, int credits, String departmentName) {
        super(code, name, semester, credits);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
