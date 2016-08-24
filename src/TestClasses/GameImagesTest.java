package TestClasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import snakeandladder.GameImages;

public class GameImagesTest {
	
	GameImages test = new GameImages();

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
	public void testGetSnake() {
		test.getSnake();
		assertEquals(test.getSnake(), test.snakePic);
	}

	@Test
	public void testGetLadder() {
		test.getLadder();
		assertEquals(test.getLadder(), test.ladderImage);
	}

	@Test
	public void testGetTwoLabel() {
		test.getTwoLabel();
		assertEquals(test.getTwoLabel(), test.pinkAndBlue);
	}

	@Test
	public void testGetThreeLabel() {
		test.getThreeLabel();
		assertEquals(test.getThreeLabel(), test.pinkGreeAndBlue);
	}
	
	@Test
	public void testGUI() {
		test.GUI();
		
	}



	@Test
	public void testGet13Button() {
		test.get13Button();
		assertEquals(test.get13Button(), test.blueAndGreen);
	}
	
	
	

	@Test
	public void testDice1() {
		test.getdice1();
		assertEquals(test.getdice1(), test.dice1);
	}
	@Test
	public void testDice2() {
		test.getdice2();
		assertEquals(test.getdice2(), test.dice2);
	}
	@Test
	public void testDice3() {
		test.getdice3();
		assertEquals(test.getdice3(), test.dice3);
	}
	@Test
	public void testDice4() {
		test.getdice4();
		assertEquals(test.getdice4(), test.dice4);
	}
	@Test
	public void testDice5() {
		test.getdice5();
		assertEquals(test.getdice5(), test.dice5);
	}
	@Test
	public void testDice6() {
		test.getdice6();
		assertEquals(test.getdice6(), test.dice6);
	}




}
