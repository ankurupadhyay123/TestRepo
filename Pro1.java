import java.util.*;

class Pro1{
public static void main(String args[]){

Scanner sc = new Scanner(System.in); 
System.out.println("Enter a string"); 
String acutalString = sc.nextLine();

System.out.println("Enter a string which gets replaced");
String stringWhichGetsReplaced = sc.nextLine();

System.out.println("Enter a string which is to be replaced");
String stringWhichIsToBeReplaced = sc.nextLine();

String result = acutalString.replace(stringWhichGetsReplaced,stringWhichIsToBeReplaced);
System.out.println(result);
}
}
