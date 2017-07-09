import java.util.*;

class Pro5{

public static void main(String args[]){

int[] n1 = new int[10];
int[] n2 = new int[5];

Scanner sc = new Scanner(System.in); 
System.out.println("Enter elements in array less than 11"); 
for(int i = 0;i<10;i++){
n1[i]=sc.nextInt();
}

System.out.println("Enter elements in array less than 6"); 
for(int i = 0;i<5;i++){
n2[i]=sc.nextInt();
}

System.out.println("new elements"); 
for(int i=0; i<n1.length;i++){
	for(int j=0; j<n2.length;j++){
		if(n1[i] == n2[j]){
			System.out.print(n1[i]+" ");
		}
	}
}

}

}
