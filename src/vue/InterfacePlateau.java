package vue;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InterfacePlateau extends JFrame{

	public InterfacePlateau() throws IOException {
		this.setTitle("ChessBurger");
		this.setSize(800, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		affichePNG();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//this.pack();
	}
	
	private void affichePNG() throws IOException {
		
		/*ImageIcon icon = new ImageIcon("src/ressources/images/plateau.png");
	    JTextArea text = new JTextArea() 
	    {
	      Image img = icon.getImage();
	      // initialiseur d'instance
	      {setOpaque(false);}
	      public void paintComponent(Graphics graphics) 
	      {
	        graphics.drawImage(img, 0, 0, this);
	        super.paintComponent(graphics);
	      }
	    };*/
	}
}
