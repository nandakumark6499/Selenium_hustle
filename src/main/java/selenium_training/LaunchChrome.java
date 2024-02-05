package selenium_training;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver1	= new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		// Enter your full Name

		driver.findElementById("fullName").sendKeys("Jiiva");
		Thread.sleep(3000);
		// Append a text and press keyboard tab
		driver.findElementById("join").sendKeys(" person", Keys.TAB);

		// What is inside the text box String s =
		String s = driver.findElementById("getMe").getAttribute("value");
		System.out.println(s);
		
		//Clear the text
		driver.findElementById("clearMe").clear();
		
		//Confirm edit field is disabled
		boolean isedit = driver.findElementById("noEdit").isEnabled();
		System.out.println(isedit);
		
		//Confirm text is readonly
		String e =driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(e);
		
		//quit browser
		driver.quit();
	}

}
