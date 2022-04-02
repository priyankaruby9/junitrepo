package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;

public class CalculatorTest {
	@Tag("Sanity")
	@Test
	public void addTest1() {
		assertEquals(9, Calculator.add(4, 5));
		
	}
	
	@Test
	public void subTest1() {
		assertEquals(1, Calculator.sub(5,4));
		
	}

}
