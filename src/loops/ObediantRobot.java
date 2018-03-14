package loops;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.setSpeed(500);
		rob.penDown();
		String color = JOptionPane.showInputDialog("What color do you want?");
		if (color.equals("red")) {
			rob.setPenColor(255, 0, 0);

		} else {
			rob.setRandomPenColor();
		}

	

	String answer = JOptionPane.showInputDialog("What shape do you want?");if(answer.equals("circle"))
	{
		drawCircle();
	}else if(answer.equals("square"))
	{
		drawSquare();
	}else if(answer.equals("triangle"))
	{
		drawTriangle();
	}else
	{
		JOptionPane.showMessageDialog(null, "We can't draw that?");}
	}

	

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(360/4);}
	}

	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			rob.move(100);
			rob.turn(360 / 3);
		}
	}

	public static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(360 / 360);
		}
	}
}
