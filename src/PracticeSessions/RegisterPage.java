package PracticeSessions;

public class RegisterPage {

	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	private String password;
	private String confirmPassword;

	public RegisterPage(String firstName, String lastName, String email, String telephone, String password,
			String confirmPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void login() {
		if (firstName.isEmpty()) {
			System.out.println("Please enter the firstName");
			return;
			
//		} else {
//			System.out.println(firstName + " " + lastName + " " + email + " " + telephone + " " + password + " "
//					+ confirmPassword);
		}
		System.out.println("ABC");
	}

}
