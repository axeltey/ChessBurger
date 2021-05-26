package vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class InterfacePlateau extends JFrame{
	
	private ImagePanel plateau;
	
	public InterfacePlateau() throws IOException {
		this.setTitle("ChessBurger");
		this.setSize(800, 839);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		affichePNG();
		setContentPane(plateau);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//this.pack();
	}
	
	private void affichePNG() throws IOException{
		plateau = new ImagePanel();
		this.plateau.afficheImage("../ressources/images/plateau.png");
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
