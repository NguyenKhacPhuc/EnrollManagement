package Assignment1;

public class Module {
	private String code;
	private String name;
	private int semester;
	private int credit;

	public Module(String code, String name, int semester) {
		this.code = code;
		this.name = name;
		this.semester = semester;
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

	@Override
	public String toString() {
		return "Module{" + "code='" + code + '\'' + ", moduleName='" + name + '\'' + ", semester=" + semester + '}';
	}

}
