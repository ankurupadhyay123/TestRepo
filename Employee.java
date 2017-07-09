public class Employee{

    private String name;
    private double salary,age;
// TODO: Good Practice is to mark variable of a class private and use public getter and setter

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }

    Employee(String name, double age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString(){
        return name+" "+age+" "+salary;
    }
}
