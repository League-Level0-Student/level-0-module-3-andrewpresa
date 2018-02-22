
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot(); 
		rob.setSpeed(500);

		//3. ask the user what color they would like the robot to draw
		
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)
	
		for (int i = 0; i < 100; i++) {
			String selection = JOptionPane.showInputDialog(null,"choose a random color");
			if(selection.equals("red")) {
		rob.setPenColor(Color.red);}
			else if(selection.equals("blue")){
			rob.setPenColor(Color.blue);}
			else if(selection.equals("black")){
				rob.setPenColor(Color.black);}
			else if(selection.equals("orange")){
				rob.setPenColor(Color.orange);}
			else if(selection.equals("cyan")){
				rob.setPenColor(Color.cyan);}
			else if(selection.equals("magenta")){
				rob.setPenColor(Color.magenta);}
			else if(selection.equals("pink")){
				rob.setPenColor(Color.pink);}
			else if(selection.equals("green")){
				rob.setPenColor(Color.green);}
			else if(selection.equals("gray")){
				rob.setPenColor(Color.gray);}
			else if(selection.equals("light gray")){
				rob.setPenColor(Color.LIGHT_GRAY);}
			else if(selection.equals("white")){
				rob.setPenColor(Color.white);}
			else if(selection.equals("yellow")){
				rob.setPenColor(Color.yellow);}
			else if(selection.equals("black")){
				rob.setPenColor(34, 0, 0);}
			
			else{
				rob.setRandomPenColor();}
		rob.setPenWidth(10);
		rob.penDown();
		rob.setAngle(90);
		rob.move(90);
		rob.setAngle(180);
		rob.move(90);
		rob.setAngle(270);
		rob.move(90);
		rob.setAngle(360);
		rob.move(90);

		}
	
	}

}
