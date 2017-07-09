import java.util.*;

class Pro8{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in); 
	System.out.println("enter a string");
	String str = sc.nextLine();
	StringBuffer name = new StringBuffer(str);
	name.reverse();
	
	System.out.println(name);

	name.delete(4,9);

	System.out.println(name);
}

}
