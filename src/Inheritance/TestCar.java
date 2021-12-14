package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
		BMW.drive();
		//b.drive();
		
		System.out.println("1  --------------");
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.engine();
		a.theftSafety();
		a.sportsMode();
		
		System.out.println("2  --------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.drive();
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		
//		BMW b1 = (BMW) new Car();//ClassCastException
//		b1.start();
		
		Vehicle v = new BMW();
		v.engine();
		v.start();
		
		
		
	
		

	}

}
