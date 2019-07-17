package JUnit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class MyArrayObjectEqualsTest {
	Object[] expectedEmps=new Object[3];
	@Before
	public void initInputs() {
		expectedEmps[0] = new Employee("Nats", 1, 15000);
        expectedEmps[1] = new Employee("Kalid", 2, 25000);
        expectedEmps[2] = new Employee("Krish", 3, 5000);
	}
	@Test
	public void compareEmployees() {
		Object[] testOutput=Employee.getEmployeeList().toArray();
		assertArrayEquals(expectedEmps, testOutput);
	}

}
