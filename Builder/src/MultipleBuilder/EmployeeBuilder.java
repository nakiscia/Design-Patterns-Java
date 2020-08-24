package MultipleBuilder;

public class EmployeeBuilder {
    protected Employee employee = new Employee();

    public EmployeeBuilder withName(String name)
    {
        this.employee.setName(name);
        return this;
    }

    public JobBuilder job(){
        return new JobBuilder(employee);
    }

    public AddressBuilder address(){
        return new AddressBuilder(employee);
    }

    public Employee build() {
        return employee;
    }

    public EmployeeBuilder withAge(int age) {
        this.employee.setAge(age);
        return this;
    }
}
