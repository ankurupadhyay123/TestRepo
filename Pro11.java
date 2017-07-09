import java.util.*;

class Pro11{

int add(int a, int b){
return a+b;
}

double add(double a, double b){
return a+b;
}

float mul(float a, float b){
return a*b;
}

int mul(int a, int b){
return a*b;
}

public static void main(String args[]){

Pro11 p = new Pro11();
int a;
float b;
double c;

Scanner sc = new Scanner(System.in); 
System.out.println("enter an integer");
a=sc.nextInt();

System.out.println("enter a float number");
b=sc.nextFloat();

System.out.println("enter a double");
c=sc.nextDouble();

System.out.println("Addition of Integers is "+p.add(a,a));
System.out.println("Addition of double is "+p.add(c,c));
System.out.println("Multiplication of float is "+p.mul(b,b));
System.out.println("Multiplication of integers is "+p.mul(a,a));

Scanner sc1 = new Scanner(System.in); 

System.out.println("enter string 1");
String s1 = sc1.nextLine();

System.out.println("enter string 2");
String s2 = sc1.nextLine();

System.out.println("enter string 3");
String s3 = sc1.nextLine();

String s4 = s1.concat(s2);
String s5 = s1.concat(s2).concat(s3);

System.out.println(" string 1 + string 2 is "+s4);
System.out.println(" string 1 + string 2 + string 3 is "+s5);
}

}
