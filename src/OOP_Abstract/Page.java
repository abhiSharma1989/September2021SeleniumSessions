package OOP_Abstract;

public abstract class Page {
	
	public Page() {
		System.out.println("Page --- Default Constructor...");
	}
	public Page(int t) {
		System.out.println("Page --- one param const..." + t);
	}
	
	
	public abstract void title();
	
	public abstract void url();
	
	public void header() {
		System.out.println("Page Header");
	}
	
	public void logo() {
		System.out.println("Page -- Logo");
	}

}
