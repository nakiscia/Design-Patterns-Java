package RecursiveGenericExp;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder worksAt(String worksAt){
        person.setWorksAt(worksAt);
        return self();
    }

    public Person build(){
        return person;
    }

    @Override
    protected EmployeeBuilder self() {
        return (EmployeeBuilder) this;
    }
}
