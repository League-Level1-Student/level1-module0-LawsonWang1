package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
        JFrame cookie = new JFrame();
        cookie.setVisible(true);
        JButton button = new JButton();
        cookie.add(button);
        cookie.pack();
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will win the lottery");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "The weather will be good tomorrow");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will sleep 12 hours tonight");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will pass your next test");
		} else if (rand == 4){
			JOptionPane.showMessageDialog(null, "You will be in a happy mood");
		}
	}
	
}
