package constructor.copyconstructor.copynine;

public class Department {
    private String deptName;
    private int deptId;

    public Department(Department other) {
        this.deptName = other.deptName;
        this.deptId = other.deptId;
    }
    public Department(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }
    public String toString(){
        return deptName + " - " + deptId;
    }
}
