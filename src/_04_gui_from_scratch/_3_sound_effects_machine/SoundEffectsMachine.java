package _04_gui_from_scratch._3_sound_effects_machine;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.applet.AudioClip;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoundEffectsMachine implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	public void soundEffects() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		
		
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		if (e.getSource() == button1) {			
			playSound("random.wav");
		} else if (e.getSource() == button2) {			
			playSound("random.wav1.wav");
		} else if (e.getSource() == button3) {			
			playSound("sawing-wood-daniel_simon.wav");
		}
	}
}
