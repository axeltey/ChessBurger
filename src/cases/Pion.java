package cases;
import principal.*;

public class Pion extends Piece{
	

	public Pion(Couleur couleur){
		super(couleur);
	}
	
	public boolean[][] deplacements(int [] position, Plateau plateau) {
		int x;
		if (plateau.getCases()[position[0]][position[1]].getPiece().getCouleur()==Couleur.values()[0]) {
			x=1;
		}
		else {
			x=-1;
		}
		if (plateau.getCases()[position[0]+x][position[1]].getPiece()==null) {	//DEVANT
			 addDeplacementsPossibles(position[0]+x,position[1]);
			//je sais pas trop si je peux ajouter à la suite du tablaeu existant avec ça ou si ça redefini mon tableau donc si ça supprime ce que y avait avant
			//si jamais on peut creer un tableau de taille predefinie +++ grande et modifier les cases pr pas avoir de probleme mais c pas ouf
		}
		if (plateau.getCases()[position[0]+x][position[1]+1].getPiece()!=null) {
			if (plateau.getCases()[position[0]+x][position[1]+1].getPiece().getCouleur()!=plateau.getCases()[position[0]][position[1]].getPiece().getCouleur()) {	//DEVANT COTE1
				addDeplacementsPossibles(position[0]+x,position[1]+1);
			}
		}
		if (plateau.getCases()[position[0]+x][position[1]-1].getPiece()!=null) {
			if (plateau.getCases()[position[0]+x][position[1]-1].getPiece().getCouleur()!=plateau.getCases()[position[0]][position[1]].getPiece().getCouleur()) {	//DEVANT COTE2
				addDeplacementsPossibles(position[0]+x,position[1]-1);
			}
		}
		return null;
	}

	public String toString() {
		return "pion " + super.toString();
	}
	
}
