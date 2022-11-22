package Assignment1;

public class Enrolment {
	private double internalMark;
	private double examinationMark;
	private double aggregatedMark;
	private Student student;
	private Module module;

	public Enrolment(Student student, Module module) {
		this.student = student;
		this.module = module;
	}

	public Enrolment(Student student, Module module, double internalMark, double examinationMark) {
		this.student = student;
		this.module = module;
		this.internalMark = internalMark;
		this.examinationMark = examinationMark;
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

	public Student getStudent() {
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

	public void Grade() {
		aggregatedMark = 0.4 * getInternalMark() + 0.6 * getExaminationMark();
		if (aggregatedMark >= 0 && aggregatedMark < 4) {
			System.out.println("F");
		} else if (aggregatedMark >= 4 && aggregatedMark < 6)
			System.out.println("P");
		else if (aggregatedMark >= 6 && aggregatedMark < 8)
			System.out.println("G");
		else
			System.out.println("E");
	}

	public String checkId() {
		return this.student.getId();
	}

}
