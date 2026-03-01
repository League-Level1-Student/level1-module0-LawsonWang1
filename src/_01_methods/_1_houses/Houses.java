package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		// Check the recipe to find out what code to put here
		Robot rob = new Robot();
		rob.penDown();
		rob.setWindowSize(1000, 500);
		rob.setX(100);
		rob.setY(400);
		rob.setSpeed(10);
		
	}
	void drawPointyRoof() {
		rob.move(200);
		rob.turn(60);
		rob.move(50);
		rob.turn(60);
		rob.move(50);
		rob.turn(60);
		rob.move(200);
		rob.turn(-90);
		rob.move(30);
	}
}
