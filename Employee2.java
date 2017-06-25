import java.io.Serializable;
import java.rmi.server.UID;

public class Employee2 implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
