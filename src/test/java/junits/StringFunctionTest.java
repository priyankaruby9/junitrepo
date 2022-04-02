package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class StringFunctionTest {
	
	@DisplayName("Positive Test")
	@Test
	public void Test1() {
		assertTrue(StringFuctions.ispalindrome("madam"));
	}
	
	@CustomAnnotation
	public void Test2() {
		assertFalse(StringFuctions.ispalindrome("priya"));
	}

}
