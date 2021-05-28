package cases;

import principal.Couleur;
import principal.Plateau;
import vue.ImagePanel;

public abstract class Piece {

	Couleur couleur;
	private boolean [][] deplacementsPossibles;
	
	public Piece(Couleur couleur) {
		this.couleur=couleur;
	}
	
	protected void setDeplacementsPossibles(boolean[][] deplacementsPossibles) {
		this.deplacementsPossibles = deplacementsPossibles;
	}
	
	protected void addDeplacementsPossibles(int x,int y) {
		this.deplacementsPossibles[x][y]=true;
	}

	public boolean[][] getDeplacementsPossibles() {
		return deplacementsPossibles;
	}
	
	public boolean [][] deplacements(int [] position, Plateau plateau) {	//[5,7] exmpl position, [[5,8][6,7]] exmpl deplacementsPossibles
		return deplacementsPossibles;
	}
	
	public String toString() {
		return couleur.toString();
	}

	public Couleur getCouleur() {
		return couleur;
	}
	
	public void afficherPiece(String image,int x,int y,ImagePanel plateau) {
		plateau.afficheImage(this,image,x,y);
	}

}
