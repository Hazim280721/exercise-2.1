
public class truck {

	String model;
	String color;
	String size;
	int maxSpeed;
	int acc;
	double price;
	
	void storage(String g) {
	
		System.out.println("can storage "+ g + " kg");
	}
	
	void acceleration(int k,int d){
		
	   acc=d-k;
		System.out.println("acceleration full storage: "+acc+" km/h");
	}
	void fueltank(int j) {
	 price=1.50*j;
		System.out.println("price full tank fuel :RM "+price);
	}
		
	void printTruck(String a,String b, String c, int d) {
		System.out.println("truck model: "+a);
		System.out.println("truck color: "+b);
		System.out.println("truck size: "+c);
		System.out.println("truck max speed: "+d);
		
	
	

	
}}
