import java.util.*;

class Pro3{

public static void main(String args[]){

Scanner sc = new Scanner(System.in); 
System.out.println("Enter a string"); 
String name = sc.nextLine();

//String name = "I have a Asus laptop Asus laptop Asus laptop laptop";
String[] word = name.split("a");

System.out.println(word.length-1);

}
}
