package PracticeSessions;

public class TestRegistration {

	public static void main(String[] args) {
		
		RegisterPage rp = new RegisterPage("", "Milne", "adam@test.com", "139123823", "admin1", "admin1");
		//String a = rp.getFirstName();
		//System.out.println(a);
		rp.getLastName();
		rp.getEmail();
		rp.getTelephone();
		rp.getPassword();
		rp.getConfirmPassword();
		rp.login();
		
		rp.setEmail("adam1@test.com");
		rp.setTelephone("9780704172");
		
		rp.login();

	}

}
