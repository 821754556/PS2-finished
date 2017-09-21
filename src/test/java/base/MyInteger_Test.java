package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	MyInteger w = new MyInteger(80);
	MyInteger y = new MyInteger(13);
	MyInteger z = new MyInteger(23);
	MyInteger g = new MyInteger(6);
	MyInteger b = new MyInteger(11);
	MyInteger c = new MyInteger(83);
	MyInteger j = new MyInteger(22);
	MyInteger k = new MyInteger(22);
	

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
		assertTrue(w.isEven());
		assertTrue(y.isOdd());
		assertTrue(z.isPrime());
		assertTrue(MyInteger.isEven(8));
		assertTrue(MyInteger.isOdd(9));
		assertTrue(MyInteger.isPrime(19));
		assertTrue(MyInteger.isEven(g));
		assertTrue(MyInteger.isOdd(b));
		assertTrue(MyInteger.isPrime(c));
		assertTrue(j.equals(22));
		assertTrue(j.equals(k)); 
		 
	}

}
