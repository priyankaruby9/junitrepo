package junits;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {
	
	@ParameterizedTest
	@ValueSource(strings= {"priya", "madam"})
	public void Test1(String name) {
		assertTrue(StringFuctions.ispalindrome(name));
		//assertTrue(StringFuctions.ispalindrome("racecar"));
	}

	@ParameterizedTest
	@ValueSource(ints= {4,5,6,7})
	public void Test1(int num) {
		assertTrue(num%2==0);
		//assertTrue(StringFuctions.ispalindrome("racecar"));
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void Test3(Month month) {
		int monthval = month.getValue();
		assertTrue(monthval<=12);
	}
	
	@ParameterizedTest
	@EnumSource(value=Month.class, names= {"APRIL","JUNE","SEPTEMBER","NOVEMBER"})
	public void Test4(Month month) {
		assertEquals(30,month.length(false));
	}
	

	@ParameterizedTest
	@EnumSource(value=Month.class, names= {"FEBRUARY"} )
	public void Test5(Month month) {
		assertEquals(28,month.length(false));
	}
	
	@ParameterizedTest
    @EnumSource (value=Month.class, names= {"FEBRUARY"})
    public void test6(Month month) {
        assertEquals(29,month.length(true));
    }
	
	@ParameterizedTest
	@MethodSource("DPMethod")
	public void Test7(String name) {
		assertTrue(StringFuctions.ispalindrome(name));
	}
	
	public static Stream<String> DPMethod(){
		return Stream.of("radar","madam","priya","mom");
	}
}
