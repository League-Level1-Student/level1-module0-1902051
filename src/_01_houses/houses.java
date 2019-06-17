package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot("rob");
	public static void main(String[] args) {

		
		
		rob.setX(100);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(25);
		
		
		for (int i = 0; i < 10; i++) {
drawhouse(new Random().nextInt(300)+100 );
	}
	

	
	}

	static void drawhouse(int height) {
		rob.move(height);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(height);
		rob.turn(270);
		rob.move(20);
		rob.turn(270);
	}



}
