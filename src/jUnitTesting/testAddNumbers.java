package jUnitTesting;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {
Scanner sc = new Scanner(System.in);
	@Test
	void test() {
		testFunction t = new testFunction();
		System.out.println("Enter the values of n1 & n2");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = t.addNumbers(n1,n2);
		assertEquals(n1+n2, result);
	}

}
