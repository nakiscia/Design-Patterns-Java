package RecursiveGenericExp;

public class RGDemo {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.withName("Ahmet").withAge(25).build();

        System.out.println(person);

        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Person emp = employeeBuilder.withName("Test").withAge(26).worksAt("Amazon").build();

        System.out.println(emp);
    }
}
