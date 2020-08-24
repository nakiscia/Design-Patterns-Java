package RecursiveGenericExp;

public class Person {
    String name;
    String worksAt;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorksAt() {
        return worksAt;
    }

    public void setWorksAt(String worksAt) {
        this.worksAt = worksAt;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", worksAt='" + worksAt + '\'' +
                ", age=" + age +
                '}';
    }
}
