import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee2 {

    public static void main(String[] args) {
        Employee2 emp = null;
        try {
            FileInputStream filein = new FileInputStream("employeeDate.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            emp = (Employee2)in.readObject();
            in.close();
            filein.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + emp.name);
        System.out.println("Address: " + emp.age);
        System.out.println("Number: " + emp.salary);
    }
}
