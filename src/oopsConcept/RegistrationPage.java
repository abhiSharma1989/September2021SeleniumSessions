package oopsConcept;

public class RegistrationPage {

	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	private String password;
	private String passwordConfirm;

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

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	public void login(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
		System.out.println("Registration Details are as follows : " + firstName + " " + lastName + " " + email + " " + telephone + " " + password + " " + passwordConfirm);
	}

	public RegistrationPage(String firstName, String lastName, String email, String telephone, String password,
			String passwordConfirm) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}


}
