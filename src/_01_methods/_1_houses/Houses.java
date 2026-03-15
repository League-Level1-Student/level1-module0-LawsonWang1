package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	public static Robot rob = new Robot();
		
	public void run() {
		// Check the recipe to find out what code to put here
		rob.penDown();
		rob.setWindowSize(1000, 500);
		rob.setX(10);
		rob.setY(400);
		rob.setSpeed(25);
		rob.setRandomPenColor();
		
		for(int x = 1; x < 10; x++) {
			String size = "";
			if (x % 2 == 0) {
				if (x == 2 || x == 8) {
				 size =  "medium";
				} else if (x ==  6|| x == 4) {
				 size =  "large";
				}
					   drawFlatRoof(size);
		} else {
				if (x == 3 || x == 5) {
					 size =  "small";
					} else if (x == 1 || x == 7 || x == 9) {
					 size =  "medium";
					}
				drawPointyRoof(size);
			}
		}
	}
	public static void drawPointyRoof(String height) {
		int heightAsInt = 0;
		if (height.equals("small")) {
			heightAsInt = 60;
		}
		else if (height.equals("medium")) {
			heightAsInt = 120;
		}
		else if (height.equals("large")) {
			heightAsInt = 250;
		}
		rob.move(heightAsInt);
		rob.turn(60);
		rob.move(35);
		rob.turn(60);
		rob.move(35);
		rob.turn(60);
		rob.move(heightAsInt);
		rob.turn(-90);
		rob.setPenColor(0,153,0);
		rob.move(42);
		rob.turn(-90);
		rob.setRandomPenColor();
	}
	public static void drawFlatRoof(String height) {
		int heightAsInt = 0;
		
		if (height.equals("medium")) {
			heightAsInt = 120;
		}
		else if (height.equals("large")) {
			heightAsInt = 250;
		}
		rob.move(heightAsInt);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(heightAsInt);
		rob.turn(-90);
		rob.setPenColor(0,153,0);
		rob.move(42);
		rob.turn(-90);
		rob.setRandomPenColor();
	}
}
