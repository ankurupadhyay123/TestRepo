import java.util.*;

class Pro2{
public static void main(String args[]){

Scanner sc = new Scanner(System.in); 
System.out.println("Enter a string"); 
String name = sc.nextLine();

//String name = "I have a Asus laptop Asus laptop Asus laptop laptop";
String[] words = name.split(" ");

int[] c= new int[words.length];

	for(int i=0; i<words.length; i++){
		for(int j=0; j<words.length; j++){
			if(i != j){
				if(words[i] != null && words[i].equals(words[j])){
					c[i]++;
					words[j]=null;
				}
			}
		}
	}

	for(int i=0; i<words.length; i++){
		c[i]++;
		if(words[i] != null)
		System.out.println(words[i]+" "+c[i]);
	}

}

}
