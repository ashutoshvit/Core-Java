package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyEvenOddTest {
	@Test
	public void testEvenOdd() {
		
		MyEvenOdd my=new MyEvenOdd();
		assertEquals("11 is Even", true,my.isEvenNumber(11));
		
		
	}

}

