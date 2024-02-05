package Bloodysweet.Selenium_hustle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class toolsqa {

	public static void main(String[] args) throws Throwable {
	       System.setProperty(
	               "webdriver.chrome.driver",
	               "C:\\Users\\Jiiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	           // Instantiate a ChromeDriver class.
	       	   WebDriver driver = new ChromeDriver();
	           //ChromeDriver driver = new ChromeDriver();
	           
	           
	    
	           // Maximize the browser
	           driver.manage().window().maximize();
	           
	           //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    
	           // Launch Website
	           driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
	           //driver.quit();
	           driver.navigate().to("https://demoqa.com");
	           
	           System.out.println(driver.getPageSource());
	           
	           //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
	           
	           //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Elements')]")));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", By.xpath("//h5[contains(text(),'Elements')]"));
	           //Thread.sleep(500); 
	           driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();     
	           driver.findElement(By.xpath("//span[@class='text' and contains(text(),'Text Box')]")).click();
	           driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Joseph");
	           driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("leodas@gmail.com");
	           driver.findElement(By.xpath("//textarea[@id='currentAddress']]")).sendKeys("No 30 , white town , USA.");
	           driver.findElement(By.xpath("//textarea[@id='permanentAddress']]")).sendKeys("No 30 , white town , USA.");
	           driver.findElement(By.xpath("//button[@id='submit']")).click();	         
	}

}
