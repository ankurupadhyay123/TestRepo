class Pro6{

public static void main(String args[]){

int[] n1 = {1,1,2,2,3,4,4,5,5};
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
