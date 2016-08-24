
package snakeandladder;

import java.awt.Color;

import com.thehowtotutorial.splashscreen.JSplash;


/**
 * This class is the super class. In another words, it is the first class to start processing when you compile the software.
 * @author U1476904 Azhan Rashid
 */

public class GameLaunch {
   
	public GameLaunch(){
		super();		//This class is the super class.
	}
	
	/**
     * @param args the command line arguments
     * Here I am stating which class should start processing when the user run the program. 
     * The MainMenu class is important because it is the first window frame, when the splash screen has completed it process.
     * The Splash class is the first thing the program do when you compile the project. It is simply a picture with a boot up bar at the bottom with several names.
     * The CustomizeBoard class is used to create the game grid, it has a strong relation ship with the Player class as well. 
     */
    public static void main(String[] args) { 
    	
    	try {
    		
            setLookAndFeel(); //This method is from a constructor below.
            GameMenu mainMenu = new GameMenu();  
            CustomizeBoard cus = new CustomizeBoard();
            Players player = new Players();
            SplashScreen spl = new SplashScreen(); 
            spl.splash();  //making the splash screen to operate in the super class.
            mainMenu.setClasses(cus,player); //using these variable made the class to have less code.
            cus.setClasses(player,null, null);
            mainMenu.setVisibility(true); //Setting the MainMenu class visible
            mainMenu.printHighScores(); //Setting the MainMenu class to print the high score.
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    	
    	Music music = new Music();
    	music.backgroundMusic();
    
    }
    /**
     * Here is the code to create the window theme. I chose "Nimbus" theme for my game, I could have used windows, but this theme will not work in Linux computers.
     */
    public static void setLookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { 
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
