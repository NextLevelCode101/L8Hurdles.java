/*
Aditi
Lab 05 Racer Class
*/
//Change Climber in Climber.java to Racer everywhere, and remove all climbing
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class BoxTopper extends Racer
{
   public BoxTopper()
   {
      super();
   }
   public BoxTopper(int y)
   {
      super(y);
   }
   public void jumpRight(){
      turnLeft();
  
   while(!rightIsClear())
      move();
      turnRight();
      move();
      turnRight();
   while(!rightIsClear())
   move();
   
   }
}