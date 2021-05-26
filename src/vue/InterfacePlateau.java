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
		this.pack();
	}
	
	private void affichePNG() throws IOException{
		plateau = new ImagePanel();
		this.plateau.afficheImage("../ressources/images/plateau.png");
	}
}
