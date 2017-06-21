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

System.out.println(p.add(5,4));
System.out.println(p.add(5.0,4.3));
System.out.println(p.mul(5.2f,4.6f));
System.out.println(p.mul(5,4));

String s1 = "My" , s2 = " Name " ,s3 = "is Ankur";
String s4 = s1.concat(s2);
String s5 = s1.concat(s2).concat(s3);

System.out.println(s4);
System.out.println(s5);
}

}
