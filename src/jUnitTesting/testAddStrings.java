package jUnitTesting;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {
	Scanner sc = new Scanner(System.in);

	@Test
	void test() 
	{
		testFunction t = new testFunction();
		System.out.println("Enter the values of s1 & s2");
		String s1 = sc.next();
		String s2 = sc.next();
		String result = t.addStrings(s1,s2);
		assertEquals(s1+s2, result);
	}

}
