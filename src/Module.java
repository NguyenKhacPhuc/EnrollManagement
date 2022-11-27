public class Module {
    private  String code;
    private String name;
    private int semester;
    private int credits;

    public Module(String code, String name, int semester, int credits) {
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
}
