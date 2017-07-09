import java.util.*;

class Pro6{

public static void main(String args[]){

int[] n1 = new int[10];
Scanner sc = new Scanner(System.in); 
System.out.println("Enter elements in array less than 11"); 
for(int i = 0;i<10;i++){
n1[i]=sc.nextInt();
}
int[] c= new int[n1.length];

	for(int i=0; i<n1.length;i++){
		for(int j=0; j<n1.length;j++){
				if(i != j){
					if(n1[i] != 0 && n1[i] == n1[j] ){
					c[i]++;
					n1[j]=0;
					}
				}
			}
		}
	
	for(int i=0; i<n1.length; i++){
		c[i]++;

		if(n1[i] != 0 && c[i] == 1){
		System.out.println("Element is "+n1[i]);}
	}
}

}
