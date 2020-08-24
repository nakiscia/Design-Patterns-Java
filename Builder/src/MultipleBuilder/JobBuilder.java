package MultipleBuilder;

public class JobBuilder extends EmployeeBuilder {

    public JobBuilder(Employee emp) {
        this.employee = emp;
        this.employee.setJob(new Job());
    }

    public JobBuilder departmet(String departmentName){
        this.employee.getJob().setDepartment(departmentName);
        return this;
    }

    public JobBuilder position(String position){
        this.employee.getJob().setPosition(position);
        return this;
    }
}
