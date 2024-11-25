/*
Aditi
Lab 05 Racer Class
*/
//Change Climber in Climber.java to Racer everywhere, and remove all climbing
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class HighJumper extends Racer
{
public HighJumper()
{
super();
}
public HighJumper(int y)
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
while(frontIsClear())
move();
turnLeft();

}
}