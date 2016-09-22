package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

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
		assertTrue(1==1);
	}
	
	@Test
	public void testisEven(){
		MyInteger evenNumber2 = new MyInteger(6);
		MyInteger evenNumber = new MyInteger(8); 
		assertTrue(evenNumber.isEven());
		assertTrue(evenNumber2.isEven());
		assertTrue(MyInteger.isEven(6));
		assertTrue(MyInteger.isEven(8));
	}
	@Test
	public void testisOdd(){
		MyInteger oddNumber = new MyInteger(3);
		assertTrue(oddNumber.isOdd());
		assertTrue(MyInteger.isOdd(5));
		
	}
	@Test
	public void testisPrime(){
		MyInteger primeNumber = new MyInteger(7);
		assertTrue(primeNumber.isPrime());
		assertTrue(MyInteger.isPrime(3));
	}
	@Test 
	public void equaltest(){
		MyInteger equalNumber = new MyInteger(4);
		assertTrue(equalNumber.equals(4));
	}
}
