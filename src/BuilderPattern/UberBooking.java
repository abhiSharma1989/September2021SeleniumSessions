package BuilderPattern;

public class UberBooking {
	
	public UberBooking login() {
		System.out.println("default login");
		return this;
	}
	
	public UberBooking login(String uname, String pwd) {
		System.out.println("login with : " + uname + " : " + pwd);
		return this;
	}
	
	public UberBooking login(String uname, int otp) {
		System.out.println("login with otp : " + uname + " : " + otp);
		return this;
	}
	
	public UberBooking searchCar(String carType) {
		System.out.println("different types of Car : " + carType);
		return this;
	}
	
	public UberBooking journeyDestination(String from, String to) {
		System.out.println("Journey Destination points : " + from + " to " + to);
		return this;
	}
	
	public UberBooking carBooking() {
		System.out.println("Car is booked");
		return this;
	}
	
	public UberBooking cancelCarBooking() {
		System.out.println("Car is cancelled");
		return this;
	}
	
	public UberBooking changeDestination() {
		System.out.println("Destination changed..");
		return this;
	}
	
	public UberBooking reachDestination() {
		System.out.println("Reached successf");
		return this;
	}
	
	public UberBooking doPayment(String paytm) {
		System.out.println("do payment via: " + paytm);
		return this;
	}

	public UberBooking doPayment(int cash) {
		System.out.println("do payment via: " + cash);
		return this;
	}

	public UberBooking doPayment(String CC, int cvv, int otp) {
		System.out.println("do payment via: " + CC + ": " + cvv + ": " + otp);
		return this;
	}
	
	public UberBooking closeApp() {
		System.out.println("Uber app closed");
		return this;
	}
}
