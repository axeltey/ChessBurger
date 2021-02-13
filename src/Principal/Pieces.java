package Principal;

public abstract class Pieces {

	Couleur couleur;
	int [][] deplacementsPossibles;
	
	public Pieces(Couleur couleur) {
		this.couleur = couleur;
	}
	
	public int [][] deplacements(int [] position, Plateau plateau) {	//[5,7] exmpl position, [[5,8][6,7]] exmpl deplacementsPossibles
		return deplacementsPossibles;
	}
	
	public String toString() {
		return couleur.toString();
	}

	public Couleur getCouleur() {
		return couleur;
	}

}
