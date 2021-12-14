package oopsConcept;

public class TestEncapsulation {
	
	public String name;
	private int shareprice;
	public String hq;
	
	public void AddValue() {
		System.out.println(name + " " + shareprice + " " + hq);
	}
	

	public static void main(String[] args) {
	TestEncapsulation obj = new TestEncapsulation();
	obj.name = "Test";
	obj.shareprice = 2541;
	obj.hq = "Chandigarh";
	obj.AddValue();

	}

}
