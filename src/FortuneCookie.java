
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
	 JFrame frame = new JFrame();
		   frame.setVisible(true);
		   JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		    button.addActionListener(this);
	JOptionPane.showMessageDialog(null,"W0Oh0o");
	

	button.addActionListener(this);
	}

	   int rand = new Random().nextInt(5);

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	

	}
}
