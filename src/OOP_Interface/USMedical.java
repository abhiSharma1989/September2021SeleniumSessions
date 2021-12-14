package OOP_Interface;

public interface USMedical extends WHO {

	public void physioServices();
	
	public void cardioServices();
	
	public void oncologyServices();
	
	public void emergencyServices();
	
	//static methods are allowed in Java with body
	public static void billing() {
		System.out.println("US Medical -- Billing");
	}
	
	
	default void medInsurance() {
		System.out.println("US Medical Insurance");
	}
	
	
}
