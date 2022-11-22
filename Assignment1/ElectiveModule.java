package Assignment1;

public class ElectiveModule extends Module {

	private String departmentName;

	public ElectiveModule(String code, String name, int semester, String departmentName) {
		super(code, name, semester);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
