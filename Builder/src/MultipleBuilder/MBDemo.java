package MultipleBuilder;

public class MBDemo {
    public static void main(String[] args) {

        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Employee employee = employeeBuilder.withName("Ahmet").withAge(25)
                                            .address()
                                                .city("Ankara")
                                                .postCode("06800")
                                                .street("Metu")
                                                .country("Turkey")
                                            .job()
                                                .departmet("Engineering")
                                                .position("Software Engineer")
                                            .build();

        System.out.println(employee);

    }
}
