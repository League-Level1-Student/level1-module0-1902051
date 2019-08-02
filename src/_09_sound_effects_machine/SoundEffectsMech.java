package _09_sound_effects_machine;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundEffectsMech {
public static void main(String[] args) {
		  
		}
public void showButton() {
    System.out.println("Button clicked");
    


	 JFrame frame = new JFrame();
	 JButton button = new JButton();	
	 frame.add(button);
     frame.setSize(800, 800); 
	 frame.pack();
	    frame.setVisible(true);
	    frame.add(button);
	    frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
button.getAction();
	    
	    int rand = new Random().nextInt(5);









}
}
