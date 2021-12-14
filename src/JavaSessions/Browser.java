package JavaSessions;

public class Browser {
	
	String name;
	double version;
	String vendor;
	
	public void getInfo(Browser br) {
		System.out.println(br.name + " " + br.version + " " + br.vendor);
	}
	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Browser b = new Browser();
		b.name = "Safari";
		b.version = 58.68;
		b.vendor = "Apple";
		b.getInfo(b); // Call by Reference/Pass by Reference
		b.sum(800, -500);//Call by Value

	}

}
