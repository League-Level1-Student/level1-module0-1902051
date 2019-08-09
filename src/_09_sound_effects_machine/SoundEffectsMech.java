package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMech implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel panel = new JPanel();
	JButton gobble = new JButton();
	JButton phonering = new JButton();
	JButton eatchips = new JButton();
	JButton cat = new JButton();
	JButton oof = new JButton();
	JButton fart = new JButton();

	public void showButton() {
		System.out.println("Button clicked");


		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		frame.setTitle("S0und Effects Mechine!!!");
		gobble.setText("Gobble");
		phonering.setText("Electric Phone Ring");
		eatchips.setText("Eating chips");
		cat.setText("Cat Being Mad");
		oof.setText("Homemade oof");
		fart.setText("Fart");
		int rand = new Random().nextInt(5);
		oof.addActionListener(this);
		cat.addActionListener(this);
		eatchips.addActionListener(this);
		phonering.addActionListener(this);
		gobble.addActionListener(this);
		fart.addActionListener(this);
		panel.add(oof);
		panel.add(cat);
		panel.add(eatchips);
		panel.add(phonering);
		panel.add(gobble);
		panel.add(fart);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton pressed = (JButton) e.getSource();
	}

	private void playSound(String fileName) {

		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));

		sound.play();

	}

}
