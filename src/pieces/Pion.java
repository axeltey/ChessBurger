package pieces;
import Principal.*;

public class Pion extends Piece{
	

	public Pion(Couleur couleur){
		super(couleur);
	}
	
	public int [][] deplacements(int [] position, Plateau plateau) {
		int x;
		
		if (plateau.plateau[position[0]][position[1]].getCouleur()==Couleur.values()[0]) {
			x=1;
		}
		else {
			x=-1;
		}
		if (plateau.plateau[position[0]+x][position[1]]==null) {	//DEVANT
			 addDeplacementsPossibles(position[0]+x,position[1]);
			//je sais pas trop si je peux ajouter à la suite du tablaeu existant avec ça ou si ça redefini mon tableau donc si ça supprime ce que y avait avant
			//si jamais on peut creer un tableau de taille predefinie +++ grande et modifier les cases pr pas avoir de probleme mais c pas ouf
		}
		if (plateau.plateau[position[0]+x][position[1]+1]!=null) {
			if (plateau.plateau[position[0]+x][position[1]+1].getCouleur()!=plateau.plateau[position[0]][position[1]].getCouleur()) {	//DEVANT COTE1
				addDeplacementsPossibles(position[0]+x,position[1]+1);
			}
		}
		if (plateau.plateau[position[0]+x][position[1]-1]!=null) {
			if (plateau.plateau[position[0]+x][position[1]-1].getCouleur()!=plateau.plateau[position[0]][position[1]].getCouleur()) {	//DEVANT COTE2
				addDeplacementsPossibles(position[0]+x,position[1]-1);
			}
		}
		return 0;
	}

	public String toString() {
		return "pion " + super.toString();
	}
	
}
