import org.jointheleague.graphical.robot.Robot;

public class valentine {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.setWindowImage("hearts.jpg");
	rob.setSpeed(500);
	rob.setPenWidth(10);
	
    rob.setY(500);
	rob.setPenColor(0, 0, 0);
	rob.penDown();
	rob.setAngle(39);
	rob.move(250);
	rob.setAngle(-141);
	rob.move(250);
	rob.setAngle(-45);
	rob.move(250);
	for (int i = 0; i < 180; i++) {
		rob.move(2);
		rob.turn(360/360);
	}
	rob.setAngle(45);
	for (int i = 0; i < 170; i++) {
		rob.move(2);
		rob.turn(360/360);
		
	}rob.setX(275);
	rob.setAngle(90);
	rob.move(150);
	rob.move(-100);
	rob.setAngle(-1);
	rob.move(200);
	rob.setAngle(90);
	rob.move(75);
	rob.move(150);
}
}
