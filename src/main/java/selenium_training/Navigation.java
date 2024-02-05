package selenium_training;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/");
		driver.get("https://letcode.in/buttons");		
		String url=driver.getCurrentUrl();
		System.out.println("Button Page Url " +"  " +url);
		Thread.sleep(3000); 	
		driver.findElementById("home").click();
		String homeurl=driver.getCurrentUrl();
		System.out.println("Home Page Url " +"  "+ homeurl);
		Thread.sleep(3000); 
		driver.navigate().back();
		System.out.println("return back to  button Page Url " +driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.quit();
				
	}

}
