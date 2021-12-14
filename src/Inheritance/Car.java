package Inheritance;

public class Car extends Vehicle {
	
	public void start() {
		System.out.println("Car Start ---");
	}
	
	public void stop() {
		System.out.println("Car Stop ---");
	}
	
	public void refuel() {
		System.out.println("Car refuel ---");
	}
	
	public static void drive() {
		System.out.println("Car Drive ---");
	}

}
