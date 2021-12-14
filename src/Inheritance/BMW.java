package Inheritance;

public class BMW extends Car{

	public void start() {
		System.out.println("BMW Start ---");
	}
	
	public void autoParking() {
		System.out.println("BMW AutoParking ---");
	}
// Static methods cannot be override
//	public static void drive() {
//		System.out.println("BMW Drive ---");
//	}
	
}
