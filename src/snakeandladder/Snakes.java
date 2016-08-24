package snakeandladder;

/**
 * This is used in many classes in this project, for example "CustomizeBoard" class. 
 * This class is to indicate where the snakes starts and finishes, this only happens when the random has completed its process.
 * @author U1476904 Azhan Rashid
 *
 */

public class Snakes {
	
        int from, to;

        public void setSnake(int f, int t){
            from =f;
            to = t;
        }

    public int getFrom(){
    	return from;
    }
    public int getTo(){
    	return to;
    }
}
