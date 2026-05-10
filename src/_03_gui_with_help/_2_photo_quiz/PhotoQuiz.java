package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String image = "https://ichef.bbci.co.uk/images/ic/1200xn/p0dn6xn6.png";
		// 2. create a variable of type "Component" that will hold your image
		Component hold;
		// 3. use the "createImage()" method below to initialize your Component
		hold = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(hold);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("What is this formula?");
		// 7. print "CORRECT" if the user gave the right answer
		if (question.equalsIgnoreCase("Pythagorean Theorem")) {
			JOptionPane.showMessageDialog(null, "CORRECT");	
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(hold);
		// 10. find another image and create it (might take more than one line
		// of code)
		String imageTwo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRubzaFTMW5YhVvkXlk7ZrNg41VxDedlWTkbA&s";
		Component holdTwo;
		holdTwo = createImage(imageTwo);
		// 11. add the second image to the quiz window
		quizWindow.add(holdTwo);
		// 12. pack the quiz window
		quizWindow.pack();
		String questionTwo = JOptionPane.showInputDialog("What is this formula?");
		if (questionTwo.equalsIgnoreCase("Area of a circle")) {
			JOptionPane.showMessageDialog(null, "CORRECT");	
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		quizWindow.remove(holdTwo);
		// 13. ask another question
		String imageThree = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ15C2bm4PqIPaGSIpZngzCDzeVuRVQ9UcvfA&s";
		Component holdThree;
		holdThree = createImage(imageThree);
		quizWindow.add(holdThree);
		quizWindow.pack();
		String questionThree = JOptionPane.showInputDialog("What is this formula?");
		if (questionThree.equalsIgnoreCase("Quadratic Formula")) {
			JOptionPane.showMessageDialog(null, "CORRECT");	
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
