import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee2 {

    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        emp.name = "Ankur";
        emp.age = 21;
        emp.salary = 15000;

        try {
            FileOutputStream fileOut = new FileOutputStream("employeeDate.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Employee class is serialized in /employeeDate.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
