import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Pro3 {

    public static void main(String[] args)
            throws NoSuchMethodException
            , InvocationTargetException
            , IllegalAccessException {
        Employee2 employee= new Employee2();
        employee.name = "Peter";
        employee.salary = 12000;
        employee.age = 21;

        Field[] fields = employee.getClass().getDeclaredFields();
        for(Field field: fields){
            System.out.println(field.getType()+"--"+field.getName());
        }
        System.out.println("------------------");
        Method[] methods= employee.getClass().getDeclaredMethods();
        for (Method field : methods ){
            System.out.println(field.getName());
        }
    }
}
