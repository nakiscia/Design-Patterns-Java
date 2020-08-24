package RecursiveGenericExp;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person  person = new Person();

    public SELF withName(String name){
        person.setName(name);
        return self();
    }

    public SELF withAge(int age){
        person.setAge(age);
        return self();
    }

    public Person build(){
        return person;
    }

    protected SELF self(){
        return (SELF) this;
    }
}
