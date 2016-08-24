package snakeandladder;

/**
 * This is used in many classes in this project, for example "CustomizeBoard" class. 
 * This class is to indicate where the ladders starts and finishes, this only happens when the random has completed its process.
 * @author U1476904 Azhan Rashid
 *
 */

public class Ladders{
    int from, to; //The variable where the random process has been completed.

   public void setLadders(int f, int t){
       from=f;
       to=t;
   }
   
   public int getFrom(){
	   
	   return from;
   }
   
   public int getTo(){
	   return to;
   }
}  
