package cases;

import principal.Couleur;
import principal.Plateau;

public abstract class Piece {

	Couleur couleur;
	private boolean [][] deplacementsPossibles;
	
	protected void setDeplacementsPossibles(boolean[][] deplacementsPossibles) {
		this.deplacementsPossibles = deplacementsPossibles;
	}
	
	protected void addDeplacementsPossibles(int x,int y) {
		this.deplacementsPossibles[x][y]=true;
	}

	public boolean[][] getDeplacementsPossibles() {
		return deplacementsPossibles;
	}

	public Piece(Couleur couleur) {
		this.couleur = couleur;
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

}
