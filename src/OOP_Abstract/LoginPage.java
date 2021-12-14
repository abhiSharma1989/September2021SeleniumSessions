package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP --- Default Constructor");
	}

	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	@Override
	public void url() {
		System.out.println("LP -- url");
	}
	
	public void dologin(String un, String pwd) {
		System.out.println("login with: " + un + ":" + pwd);
	}
	
	public void dologin(String un, String pwd, long ph) {
		System.out.println("login with: " + un + ":" + pwd + ":" + ph);
	}

}
