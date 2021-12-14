package JavaSessions;

public class TestSwitchAssignment {
	
	public void launchBrowser(String Browser) {
		System.out.println("The Browser Name is " + Browser);
		
		switch (Browser) {
		case "Chrome":
			System.out.println("Launch Chrome");
			break;
		case "Firefox":
			System.out.println("Launch Firefox");
			break;
		case "Safari":
			System.out.println("Launch Safari");
			break;
		case "Opera":
			System.out.println("Launch Opera");
			break;

		default:
			System.out.println("Please pass the right browser: " + Browser);
			break;
		}
	}

	public static void main(String[] args) {
		TestSwitchAssignment te = new TestSwitchAssignment();
		te.launchBrowser("Chromium");

	}

}
