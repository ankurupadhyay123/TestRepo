interface MyDemo{
    static void staticMethod(){
        System.out.println("static method of interface is called");
    }

    default void defaultMethod(){
        System.out.println("default method of interface is called");
    }
}

public class Pro5 implements MyDemo{

    public static void main(String[] args) {
        Pro5 pro5 = new Pro5();
        pro5.defaultMethod();
        MyDemo.staticMethod();
    }
}
