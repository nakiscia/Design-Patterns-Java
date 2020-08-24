package MultipleBuilder;

public class AddressBuilder extends EmployeeBuilder{


    public AddressBuilder(Employee emp) {
        this.employee = emp;
        this.employee.setAddress(new Address());
    }

    public AddressBuilder street(String streetName){
        employee.getAddress().setStreetName(streetName);
        return this;
    }

    public AddressBuilder city(String cityName){
        employee.getAddress().setCity(cityName);
        return this;
    }

    public AddressBuilder country(String countryName){
        employee.getAddress().setCountry(countryName);
        return this;
    }

    public AddressBuilder postCode(String postCode){
        employee.getAddress().setPostCode(postCode);
        return this;
    }

}
