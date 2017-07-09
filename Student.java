public class Student {

    String name;
    double score, age;
// TODO: Good Practice is to mark variable of a class private and use public getter and setter
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

//TODO: Is Age required of double type
    public double getAge() {
        return age;
    }

    public Student(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    public String toString(){
        return name+" "+score+" "+age;
    }
}
