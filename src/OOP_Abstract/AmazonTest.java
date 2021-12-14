package OOP_Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.dologin("admin", "admin");
		lp.dologin("12345", "12345", 8123981);
		lp.header();
		lp.logo();
		
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.logout();
		
//		child class object can be referred by parent abstract class reference variable
		Page p = new LoginPage();
		p.header();
		p.logo();
		p.url();
		p.title();
	
		
		
	}

}
