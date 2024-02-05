package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@class = \"_18u87m _3WuvDp\"]")).sendKeys("7502060747");
		driver.close();
	}

}
