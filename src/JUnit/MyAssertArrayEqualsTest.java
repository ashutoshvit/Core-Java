package JUnit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MyAssertArrayEqualsTest {
	@Test
	public void myTestMethod() {
		String[] result= {"Apple","Banana","Grape","Govava"};
		String[] methodOutput= {"Apple","Banana","Grape","Govava"};
		assertArrayEquals(result, methodOutput);
	}

}
