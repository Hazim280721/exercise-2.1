
public class main {

	public static void main(String[] args) {
		truck nissan = new truck();
		truck toyota = new truck();
		
		nissan.model="nissan";
		nissan.color="yellow";
		nissan.size="small";
		nissan.speed="210 km/h";
		
		toyota.model="toyota";
		toyota.color="black";
		toyota.size="big";
		toyota.speed="190 km/h";
		
		System.out.println("model: "+nissan.model);
		System.out.println("color: "+nissan.color);
		System.out.println("size : "+nissan.size);
		System.out.println("speed: "+nissan.speed);
		nissan.speed();
		nissan.storage();
		
		System.out.println();
		
		System.out.println("model: "+toyota.model);
		System.out.println("color: "+toyota.color);
		System.out.println("size : "+toyota.size);
		System.out.println("speed: "+toyota.speed);
		toyota.speed();
		toyota.storage();
	}

}
