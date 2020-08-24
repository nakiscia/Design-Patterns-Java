package MultipleBuilder;

public class Job {
    private String department;
    private String position;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Job{" +
                "department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
