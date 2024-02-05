package selenium_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locatorconcept {

	public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "\\Drivers\\msedgedriver.exe");
			WebDriver d = new EdgeDriver();
		d.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
	}
}
