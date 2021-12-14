package BuilderPattern;

public class TestUber {

	public static void main(String[] args) {
		
		UberBooking uber = new UberBooking();
		
		uber.login("83060820660", 665245)
			.searchCar("Sedane")
				.journeyDestination("Pathankot", "Chandigarh")
					.carBooking()
						.doPayment(6800)
							.closeApp();
		
		System.out.println();
		
		uber.login("Rosey@gmail.com", "Rosey@123")
			.searchCar("SUV")
				.journeyDestination("Indora", "Nangal")
					.carBooking()
						.cancelCarBooking()
							.closeApp();
		
		System.out.println();
		
		uber.login()
			.searchCar("Hatchback")
				.closeApp();
	}

}
