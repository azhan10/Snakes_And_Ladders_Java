package TestClasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import snakeandladder.GameLaunch;

public class GameLaunchTest {

	private static final Object Nimbus = null;
	GameLaunch test = new GameLaunch();
	private String[] args;
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
	public void testMain() {
		GameLaunch.main(args);
	}

	@Test
	public void testSetLookAndFeel() {
		
		GameLaunch.setLookAndFeel();
	}

}
