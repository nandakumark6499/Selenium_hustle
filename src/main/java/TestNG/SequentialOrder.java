package TestNG;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class SequentialOrder {
	@Test
	public void main1() {
		
		String s1 = "Automation Testing Engineer";
		String[] s2 = s1.split(" ");
		ArrayList<String> s3 = new ArrayList<String>();
		for (int i=0;i<s2.length;i++) {
			s3.add(s2[i]);
		}
			System.out.println(s3);
	}

}
