import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
 int age;
 String name;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ankur",21));
        employeeList.add(new Employee("Tanuj",22));
        employeeList.add(new Employee("Neha",23));
        employeeList.add(new Employee("Nitin",25));
        employeeList.add(new Employee("Shubham",21));
        employeeList.add(new Employee("Yashi",22));
        employeeList.add(new Employee("Pulkit",25));
        System.out.println(employeeList);

        System.out.println(employeeList.stream().filter(e -> e.name.startsWith("N")).filter(e -> e.age > 24).collect(Collectors.toList()));
    }

}
