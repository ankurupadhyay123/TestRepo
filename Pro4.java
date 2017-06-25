import java.util.Scanner;

@FunctionalInterface
interface Demo{
    void table(int a);

}

public class Pro4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        Demo demo = (a) -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(a+"*"+i+"="+i * a);
            }
        };
        demo.table(number);
    }
}
