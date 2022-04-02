package junits;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestExample {
	
	@RepeatedTest(3)
	public void addTest1() {
		assertEquals(9,Calculator.add(4, 5));
		System.out.println("Inside Test1");
	}
	
	@Disabled
	@Test
	public void addTest2() {
		assertEquals(9,Calculator.add(5, 4));
		System.out.println("Inside Test2");
	}
	

}
