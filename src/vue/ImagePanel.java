package vue;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.HashMap;

import javax.swing.JPanel;

import cases.Piece;
import model.ListImagePiece;

public class ImagePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private Image fond;
	private ListImagePiece images;
	MediaTracker mt;
	private int positionX;
	private int positionY;
	
	public ImagePanel() {
		images=new ListImagePiece();
		mt = new MediaTracker(this);
	}

	public void afficheFond(String filename,int x,int y) {
		positionX=x;
		positionY=y;
		java.net.URL url = this.getClass().getResource(filename);
	    fond = Toolkit.getDefaultToolkit().getImage(url);
	    try {
	    	mt.addImage(fond, 0);
	    	mt.waitForAll();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    this.setPreferredSize(new Dimension(fond.getWidth(this), fond.getHeight(this)));
	}
	
	public void afficheImage(Piece piece,String filename,int x,int y) {
		java.net.URL url = this.getClass().getResource(filename);
		Image imagePiece = Toolkit.getDefaultToolkit().getImage(url);
		images.ajoutImagePiece(piece, imagePiece, x, y);
	    try {
	    	mt.addImage(imagePiece, 0);
	    	mt.waitForAll();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	public void paint(Graphics g) {
		g.drawImage(fond, positionX, positionY, null);
	}
}