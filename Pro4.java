class Pro4{

public static void main(String args[]){
String name = "I have a Asus laptop Asus laptop Asus laptop laptop";

int lc = 0 , uc = 0 , dig = 0, spec = 0,totchar =0;
for(int i=0; i<name.length() ;i++){
	char ch = name.charAt(i);
	totchar++;
	if(Character.isUpperCase(ch)){
		uc++;
	}
	else if(Character.isLowerCase(ch)){
		lc++;
	}
	else if(Character.isDigit(ch)){
		dig++;
	}
	else{
		spec++;
	}
}
float ucper = 0.0f,lcper = 0.0f,digper = 0.0f,specper = 0.0f;
ucper=(uc*100)/totchar;
lcper=(lc*100)/totchar;
digper=(dig*100)/totchar;
specper=(spec*100)/totchar;

System.out.println("Upper: "+uc+" Percentage:"+ucper+"%");
System.out.println("Lower: "+lc+" Percentage:"+lcper+"%");
System.out.println("Digit: "+dig+" Percentage:"+digper+"%");
System.out.println("Special: "+spec+" Percentage:"+specper+"%");

}
}
