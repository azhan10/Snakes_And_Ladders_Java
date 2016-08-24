package TestClasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import snakeandladder.Snakes;

public class SnakesTest {
	
	Snakes test = new Snakes();
	private int f;
	private int t;

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
	public void testSetSnake() {
		test.setSnake(f, t);
	}
	
	@Test
	public void testSetSnakes() {
		test.setSnake(10, 10);
		assertEquals(test.getFrom(), 10);
		assertEquals(test.getTo(), 10);
	
	}

}
