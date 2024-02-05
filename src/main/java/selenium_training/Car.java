package selenium_training;

public class Car {

	static String car1 = "BMW X1";
	static String car2 = "Audi Q5";

	public boolean present() {
		return true;
	}

	public static String names() {
		return ("Name of the cars is " + car1 + " " + car2);
	}

	public void price() {
		System.out.println("The price of the "+ car1 + " is 2cr");
	}
}
