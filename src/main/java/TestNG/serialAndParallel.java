package TestNG;

import org.testng.annotations.Test;

public class serialAndParallel {
	@Test
	public void main() {

		String[] a = new String[3];
		a[0] = "Jhon";
		a[1] = "Mark";
		a[2] = "Rose";

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
