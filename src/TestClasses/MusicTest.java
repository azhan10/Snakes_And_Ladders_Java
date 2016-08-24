package TestClasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import snakeandladder.Music;

public class MusicTest {
	Music test = new Music();

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
	public void testButtonSound() {
		String soundName = null;
		test.ButtonSound(soundName);
	}

	@Test
	public void testBackgroundMusic() {
		test.backgroundMusic();
	}

}
