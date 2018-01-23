package shootGhosts;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OpeningWindow extends JPanel {

	// This is a new frame that allows us to draw this panel
	JFrame window = new JFrame();

	// Constructor Function
	OpeningWindow() {
		window.add(this);

		// Sets the window that isn't right at the top-left corner of your screen
		window.setLocation(50, 50);
		window.setUndecorated(true);
		window.setSize(1191, 670);
		
		window.setVisible(true);
	}

	// Allows us to draw our graphics
	public void paint(Graphics g) {
		// This assumes if our image exists in that location...
		ImageIcon background = new ImageIcon("./images/grassy_plains.png");

		// We draw the image starting from the top-left corner
		g.drawImage(background.getImage(),0,0,null);
	}
}
