package oopsConcept;

public class RegistrationTest {

	public static void main(String[] args) {

		RegistrationPage r = new RegistrationPage("Abhinandan", "Sharma", "abhinandansharma789@gmail.com", "9780704172", "Abhi12345", "Abhi12345");
		System.out.println(r.getFirstName());
		System.out.println(r.getLastName());
		System.out.println(r.getEmail());
		System.out.println(r.getTelephone());
		System.out.println(r.getPassword());
		System.out.println(r.getPasswordConfirm());
		r.login(r.getFirstName(), r.getLastName(), r.getEmail(), r.getTelephone(), r.getPassword(), r.getPasswordConfirm());
		

		r.setTelephone("8360820660");
		r.setPassword("Admin123");
		r.setPasswordConfirm("Admin123");
		
		System.out.println("After resetting the data : ");

		r.login(r.getFirstName(), r.getLastName(), r.getEmail(), r.getTelephone(), r.getPassword(),
				r.getPasswordConfirm());
	}

}
