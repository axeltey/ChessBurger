package vue;

import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cases.Piece;

@SuppressWarnings("serial")
public class InterfacePlateau extends JFrame{
	
	private ImagePanel plateau;
	private List<Piece> pieces;
	
	public InterfacePlateau() throws IOException {
		this.setTitle("ChessBurger");
		this.setSize(800, 839);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		affichePlateu();
		this.setContentPane(plateau);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();
	}
	
	private void affichePlateu() throws IOException{
		plateau = new ImagePanel();
		this.plateau.afficheFond("../ressources/images/plateau.png",0,0);
	}
	
	private void setContentPane(JPanel panel) {
		super.setContentPane(panel);
	}

	public ImagePanel getPlateau() {
		return plateau;
	}
	
}
