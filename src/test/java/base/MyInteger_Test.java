package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	MyInteger x = new MyInteger(6);
	MyInteger y = new MyInteger(11);
	MyInteger z = new MyInteger(23);
	MyInteger a = new MyInteger(6);
	MyInteger b = new MyInteger(9);
	MyInteger c = new MyInteger(83);
	MyInteger j = new MyInteger(20);
	MyInteger k = new MyInteger(20);
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(x.isEven());
		assertTrue(y.isOdd());
		assertTrue(z.isPrime());
		assertTrue(MyInteger.isEven(8));
		assertTrue(MyInteger.isOdd(9));
		assertTrue(MyInteger.isPrime(19));
		assertTrue(MyInteger.isEven(a));
		assertTrue(MyInteger.isOdd(b));
		assertTrue(MyInteger.isPrime(c));
		assertTrue(j.equals(20));
		assertTrue(j.equals(k)); 
		 
	}

}
