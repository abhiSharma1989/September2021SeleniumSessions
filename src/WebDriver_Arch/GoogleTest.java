package WebDriver_Arch;

public class GoogleTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String browser = "Chrome";
		
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct browser....");
		}
		
		driver.get("www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement();
		driver.findElements();
		
		driver.click();
		driver.sendKeys("abhi123");
		driver.close();
		int b = driver.webdriverfees;
		System.out.println(b);
		//driver.webdriverfees = 800; You cannot assign the value to this variable as webdriverfees is static and final in nature
		
	}

}
