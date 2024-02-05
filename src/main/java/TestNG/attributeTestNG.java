package TestNG;

import org.testng.annotations.Test;


public class attributeTestNG {
	@Test (dependsOnMethods = "run")
	public void sleep() {
		System.out.println("2 mins");
	}
	@Test(groups = {"reg"},priority = 3,description = "Have to wakeup")
	public void wake() {
		System.out.println("2 mins");
	}
	@Test  (groups = {"reg"},invocationCount = 20,threadPoolSize = 2 ,timeOut = 1000 )  //if priority is not set considered as 0 
	public void run() {
		System.out.println("10 mins");
	}
	@Test(groups = {"smoke"},priority = 4,enabled = true, alwaysRun = true)
	public void walk() {
		System.out.println("2 mins");
	}
	@Test(priority = 1 , groups = {"smoke"})
	public void work() {
		System.out.println("2 mins");
	}

}
