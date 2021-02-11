package Principal;

public abstract class Pieces {

	Couleur couleur;
	
	public Pieces(Couleur couleur) {
		this.couleur = couleur;
	}
	
	public void deplacements() {
	}
	
	public String toString() {
		return couleur.toString();
	}
}
