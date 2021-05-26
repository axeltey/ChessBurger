package vue;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class ImagePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private Image image;

	public void afficheImage(String filename) {
		java.net.URL url = this.getClass().getResource(filename);
	    image = Toolkit.getDefaultToolkit().getImage(url);
	    try {
	    	MediaTracker mt = new MediaTracker(this);
	    	mt.addImage(image, 0);
	    	mt.waitForAll();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    this.setPreferredSize(new Dimension(image.getWidth(this), image.getHeight(this)));
	  }

	  public void paint(Graphics g) {
	    g.drawImage(image, 0, 0, null);
	  }
}