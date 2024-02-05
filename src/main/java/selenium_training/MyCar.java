package selenium_training;

public class MyCar {

	public static void main(String[] args) {

		Car ob1 = new Car();
		String s = Car.names();
		ob1.present();
		ob1.price();
		System.out.println(s);
		System.out.println(Car.car1 + " and " + Car.car2);

	}

}
