package SuperKeyword;

public class LoginPage extends Page{
	
	int timeout = 200;
	
	public LoginPage() {
		super(10,20);
	}

	public void loginInfo() {
		System.out.println("login info methods");
		super.display();//Parent
		display();//Child
	}
	
	@Override
	public void display() {
		System.out.println("LP Display");
		super.display();
	}
	
	
	public void getTimeOut() {
		System.out.println(timeout);
		System.out.println(super.timeout);
	}

}
