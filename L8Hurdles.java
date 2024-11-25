// Hurdles.java
// ITCS

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import edu.fcps.karel2.WorldFrame;
  
public class L8Hurdles {
   
   // declare and initialize array of map choices for the dialogue drop-down options
   public static final String[] choices = {"racerTest", "highjumpTest", "boxtopTest", "hurdle1", "hurdle2", "hurdle3", "steeple1", "steeple2", "steeple3", "boxtop1", "boxtop2", "boxtop3" };   

   public static void main(String[] args) 
   {
      // open dialogue box and request user input of map choices
      String mapChoice = (String)JOptionPane.showInputDialog(null,"Choose an map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
         
      // open selected map and set size and speed
      Display.openWorld("maps/"+ mapChoice +".map");
      Display.setSize(18, 10);
      Display.setSpeed(10);
      //make frame pop up in top left corner of computer screen
      WorldFrame.getCurrent().setLocation(0, 0);
      
      // declare Racer reference named turbo
      Racer turbo = null;
      
      
     /*if statements to initialize Racer type (Racer, HighJumper or BoxTopper) 
      and starting location
     Include final else to initialize Racer in the case of an invalid entry*/
      if (mapChoice.equals("racerTest")||mapChoice.equals("hurdle1")||mapChoice.equals("hurdle2")||mapChoice.equals("hurdle3")) {
         turbo = new Racer(1);
      } 
      else if (mapChoice.equals("highjumpTest")||mapChoice.equals("steeple1")||mapChoice.equals("steeple2")||mapChoice.equals("steeple3")) {
         turbo = new HighJumper(1);
      } 
      else if (mapChoice.equals("boxtopTest")||mapChoice.equals("boxtop1")||mapChoice.equals("boxtop2")||mapChoice.equals("boxtop2")) {
         turbo = new BoxTopper(1);
      } 
      else {
         //invalid map option, do not instantiate turbo
         turbo = null;
         System.out.println("No Racer initialized!");
      }
      
              
      runTheRace(turbo);
      System.out.println("Race Ended!");
     
   }
 
 
   // Test the jumpRight method.
   // The Racer will move, move, then jumpRight and jump over the hurdle.
   // The Racer will finish next to the hurdle, facing to the east (right).
   public static void runTheRace(Racer r) {
      while(!r.nextToABeeper())
      if (r.frontIsClear())
         r.move();
      else
         r.jumpRight();
   
   }
   
   
}