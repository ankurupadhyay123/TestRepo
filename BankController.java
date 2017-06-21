class BankController{

public static void main(String args[]){
SBI sbi = new SBI();
BOI boi = new BOI();
ICICI icici = new ICICI();

System.out.println("Details of SBI");
sbi.getDetails(4.0f,150,1000);
System.out.println("rateOfInterest:"+sbi.rateOfInterest+" serviceCharges:"+sbi.serviceCharges+" noOfEmployees:"+sbi.noOfEmployees);

System.out.println("Details of BOI");
boi.getDetails(3.5f,200,800);
System.out.println("rateOfInterest:"+boi.rateOfInterest+" serviceCharges:"+boi.serviceCharges+" noOfEmployees:"+boi.noOfEmployees);

System.out.println("Details of ICICI");
icici.getDetails(4.2f,100,1200);
System.out.println("rateOfInterest:"+icici.rateOfInterest+" serviceCharges:"+icici.serviceCharges+" noOfEmployees:"+icici.noOfEmployees);

}

}
