package JavaSessions;

public class FunctionsInJava {
	
	public void speed() { 
		System.out.println("Car is driving at very high speed");
		int s= 100;
		System.out.println(s);
	}
	
	public int BrakeLeather() {
		System.out.println("BrakeLeathers should get changed");
		int bl =880;
		int tax = 120;
		int total = bl + tax;
		return total;
	}
	
	public boolean IsClientActive() {
		System.out.println("Is Client Active");
		return true;
	}
	
	public int Addition(int a, int b) {
		System.out.println("Test addition:");
		int c= a+b;
		return c;
	}

	public static void main(String[] args) {
		
		FunctionsInJava Car = new FunctionsInJava();
		Car.speed();
		System.out.println(Car.BrakeLeather());
		if(Car.IsClientActive()) {
			System.out.println("Pass");
		}
		boolean b = Car.IsClientActive();
		System.out.println(b);
		Car.Addition(120,880);
		int c = Car.Addition(120, 880);
		System.out.println(c);

	}

}
