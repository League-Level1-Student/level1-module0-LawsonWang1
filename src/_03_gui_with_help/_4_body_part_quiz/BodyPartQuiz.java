package _03_gui_with_help._4_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String firstImage = "/Users/league/git/level1-module0-LawsonWang1/src/_03_gui_with_help/_4_body_part_quiz/arnold.jpeg";
	String secondImage = "/Users/league/git/level1-module0-LawsonWang1/src/_03_gui_with_help/_4_body_part_quiz/leonardo.jpeg";
	String thirdImage = "/Users/league/git/level1-module0-LawsonWang1/src/_03_gui_with_help/_4_body_part_quiz/morgan.jpeg";
	String fourthImage = "/Users/league/git/level1-module0-LawsonWang1/src/_03_gui_with_help/_4_body_part_quiz/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
	}

	private void initializeGui() {
		initializeImageList();
		System.out.println("imageiterator");
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setVisible(true);
		window.pack();
		
		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(500, 500);

		showNextImage();
		startQuiz();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 0;
		// 2. Set the size of the window in the initializeGui() method 
		
		// 4. Ask the user who this person is and store their answer
		
		String guess1 = JOptionPane.showInputDialog("who is this?");
		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
		if (guess1.equalsIgnoreCase("Arnold")) {
			score++;
			JOptionPane.showMessageDialog(null, "You are right, your score is " + score);
		} else {
			JOptionPane.showMessageDialog(null, "No you are wrong, the person is Arnold. Your score is " + score);
		}
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		showNextImage();

		// 8. .... repeat 4-7 for all your images.....
		String guess2 = JOptionPane.showInputDialog("who is this?");
		if (guess2.equalsIgnoreCase("Jack")) {
			score++;
			JOptionPane.showMessageDialog(null, "You are right, your score is " + score);
		} else {
			JOptionPane.showMessageDialog(null, "No you are wrong, the person is Jack. Your score is " + score);
		}
		showNextImage();
		String guess3 = JOptionPane.showInputDialog("who is this?");
		if (guess3.equalsIgnoreCase("Leonardo")) {
			score++;
			JOptionPane.showMessageDialog(null, "You are right, your score is " + score);
		} else {
			JOptionPane.showMessageDialog(null, "No you are wrong, the person is Leonardo. Your score is " + score);
		}
		showNextImage();
		String guess4 = JOptionPane.showInputDialog("who is this?");
		if (guess4.equalsIgnoreCase("Morgan")) {
			score++;
			JOptionPane.showMessageDialog(null, "You are right, your score is " + score);
		} else {
			JOptionPane.showMessageDialog(null, "No you are wrong, the person is Morgan. Your score is " + score);
		}
		// 9. Show them their current score
		JOptionPane.showMessageDialog(null, "Your total score is " + score + " /4" );
	}

	public void showNextImage() {
		panel = new JPanel();
		panel.add(getNextImage());
		window.add(panel);
		window.setVisible(true);
		System.out.println("show image");
	}

	private JLabel loadImage(String fileName) {
		System.out.println("Image");

		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;

	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		System.out.println("list");
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);

		imageList.add( loadImage(secondImage));
	
		imageList.add(loadImage(thirdImage));

		imageList.add(loadImage(fourthImage));
	
	}

	private JLabel getNextImage() {
		System.out.println("next");
		if (imageIterator.hasNext()) {
			return imageIterator.next();
		}

		return new JLabel("No more images");
	}
}