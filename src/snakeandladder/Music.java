package snakeandladder;

/**
 * This classes handles all the sound within the project. When you press a button for example in the main menu, it generate a sound and then process. 
 * Please note, I have not used the same sound for every JButton.
 * It also creates a music on the background when you run the program.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.swing.JOptionPane;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;
   
// To play sound using Clip, the process need to be alive.
// Hence, we use a Swing application.
public class Music {
   
	public void ButtonSound(String soundName)
	 {
	   try 
	   {
	   AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
	   Clip clip = AudioSystem.getClip( );
	   clip.open(audioInputStream);
	   clip.start( );
	   }
	   catch(Exception ex)
	   {
	     System.out.println("Error with playing sound.");
	     ex.printStackTrace();
	   }
	 }
/**
 * Coding this way, all i got to do is call this method in each action listener button and writing down which song to play when the button is pressed.
 * Example;
 * Using the above code here. Then type this in the action listener constructor (for example the aboutButton);
 * Music music = new Music();
 * music.playsound("click.wav");
 */
	
	/**
	 * Creating a background music for the program. This will run all the time until the user quits the program.
	 * This needs the GameLaunch class to make the music to play starlight after the splash screen has completed.
	 * I created a random method here, so when you boot up the program, it will randomly choose out of three, which music to play until the user decides to close the program.
	 * I am also the try catch method here as well. The use here will display a message that the music is not player for whatever reason. For example, you might not have any sound on your PC.
	 */
	public void backgroundMusic() {
	    try { 
	    	
	    	Random randomMusic = new Random();
	    int random = randomMusic.nextInt(3)+1;
	    if(random == 1){
	    	//Setting my music as clip instead of AudioPlayer, AudioPlayer tend to work only short music files. Clip does not.
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("backgroundMusic1.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start(); //starting the music when the program is compiled.
	        clip.loop(clip.LOOP_CONTINUOUSLY); //repeating the music over again.
	    }
	    if(random ==2){
	    	//Setting my music as clip instead of AudioPlayer, AudioPlayer tend to work only short music files. Clip does not.
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("backgroundMusic2.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start(); //starting the music when the program is compiled.
	        clip.loop(clip.LOOP_CONTINUOUSLY); //repeating the music over again.
	    }
	    if(random ==3){
	    	//Setting my music as clip instead of AudioPlayer, AudioPlayer tend to work only short music files. Clip does not.
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("backgroundMusic3.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start(); //starting the music when the program is compiled.
	        clip.loop(clip.LOOP_CONTINUOUSLY); //repeating the music over again.
	    }
	    	
	    	
	    } catch(Exception ex) {
	    	//It will display the message in the console and ina JFrame message window.
	    	System.out.println("Error with playing sound.");
	    	JOptionPane.showMessageDialog(null, "Error with playing sound.");
	        ex.printStackTrace();
	    }
	}

	}
   



