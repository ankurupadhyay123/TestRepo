class Pro10{

public enum Houses {
TreeHouse(50000), Apartment(80000), Bungalow(150000), TinyHouse(35000);

Houses(int price){
	this.price=price;
}

protected int price;

public int getPrice(){
	return this.price;
}

};

public static void main(String[] args) {

System.out.println("Price of house is "+Houses.Apartment.getPrice());

}}
