package SeleniumScenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		//Thread.sleep(2000);
		String s = driver.getTitle();
		System.out.println(s);
		driver.findElementById("APjFqb").sendKeys("selenium tutorial techlistic");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("pcTkSc")));
		WebElement list=driver.findElement(By.className("pcTkSc"));
		List<WebElement> rows = list.findElements(By.tagName("li"));
		for(WebElement elem:rows){
		System.out.println(elem.getText());	

		}
	}
}
