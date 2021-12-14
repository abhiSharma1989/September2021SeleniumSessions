package OOP_Abstract;

public class HomePage extends Page {

	@Override
	public void title() {
		System.out.println("HP -- title");
	}

	@Override
	public void url() {
		System.out.println("HP -- url");
	}
	
	@Override
	public void header() {
		System.out.println("HomePage -- Header");
	}
	
	public void logout() {
		System.out.println("user is logged out");
	}

}
