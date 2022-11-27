package oop.assignment1;

public class Module {
    private static int count = 101;
    private static int count2 = 201;

    private String code;
    private String moduleName;
    private int semester;
    private double credit;

    public Module(String moduleName, int semester, double credit) {
        if (semester == 1) {
            setCode("M" + (count++));
        } else if (semester == 2) {
            setCode("M" + (count2++));
        }
        this.moduleName = moduleName;
        this.semester = semester;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModuleName() {
        return moduleName;
    }

    public boolean setModuleName(String moduleName) {
        if (moduleName != null) {
            this.moduleName = moduleName;
            return true;
        } else {
            return false;
        }
    }

    public int getSemester() {
        return semester;
    }

    public boolean setSemester(int semester) {
        if (semester <= 0 || semester > 12) {
            return false;
        } else {
            return true;
        }
    }

    public double getCredit() {
        return credit;
    }

    public boolean setCredit(double credit) {
        if (credit > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Module{" +
                "code='" + code + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", semester=" + semester +
                ", credit=" + credit +
                '}';
    }
}
