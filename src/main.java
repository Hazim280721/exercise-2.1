
public class main {

	public static void main(String[] args) {
		truck nissan = new truck();
		
		nissan.printTruck("nissan","yellow","small",210);
		nissan.storage("70");
		nissan.acceleration(40,210);
		nissan.fueltank(60);
		
		System.out.println();
		
		truck toyota = new truck();
		
		toyota.printTruck("toyota","black","big",190);
		toyota.storage("100");
		nissan.acceleration(60,190);
		nissan.fueltank(80);
	    
	

}}
