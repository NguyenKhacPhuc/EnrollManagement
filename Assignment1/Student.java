package Assignment1;

public class Student {

	private String id;
	private String name;
	private String dob;
	private String address;
	private String email;

	public Student(String id, String name, String dob, String address, String email) {
		this.id = id;
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student{" + "id='" + id + '\'' + ", studentName='" + name + '\'' + ", dob='" + dob + '\''
				+ ", address='" + address + '\'' + ", email='" + email + '\'' + '}';
	}

}
