package Principal;

import pieces.*;

public class Plateau {
	
	public Piece [][] plateau; //je suis pas sûr du public mais j en ai besoin pour y acceder pour les deplacements ...
	
	Plateau() {
		initialisePlateau();
	}

	void initialisePlateau() {
		plateau = new Piece [8][8];
		for (int i=0;i<8;i++) {
			plateau[1][i] = new Pion(Couleur.values()[0]);
			plateau[6][i] = new Pion(Couleur.values()[1]);
		}
		plateau[0][0] = new Tour(Couleur.values()[0]);
		plateau[0][7] = new Tour(Couleur.values()[0]);
		plateau[7][0] = new Tour(Couleur.values()[1]);
		plateau[7][7] = new Tour(Couleur.values()[1]);
		plateau[0][1] = new Cavalier(Couleur.values()[0]);
		plateau[0][6] = new Cavalier(Couleur.values()[0]);
		plateau[7][1] = new Cavalier(Couleur.values()[1]);
		plateau[7][6] = new Cavalier(Couleur.values()[1]);
		plateau[0][2] = new Fou(Couleur.values()[0]);
		plateau[0][5] = new Fou(Couleur.values()[0]);
		plateau[7][2] = new Fou(Couleur.values()[1]);
		plateau[7][5] = new Fou(Couleur.values()[1]);
		plateau[0][3] = new Reine(Couleur.values()[0]);
		plateau[7][3] = new Reine(Couleur.values()[1]);
		plateau[0][4] = new Roi(Couleur.values()[0]);
		plateau[7][4] = new Roi(Couleur.values()[1]);
		plateau[0][0] = new Tour(Couleur.values()[0]);
	}
	
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<8;i++) {
			s+="[ ";
			for(int j=0;j<8;j++) {
				s+=plateau[i][j]+" ";
			}
			s+="]\n";
		}
		return s;
	}
	
	
	public boolean deplacementPossible(Piece piece, int x,int y){
		boolean trouve=false;
		for(int i=0;i<plateau.length;i++) {
			for(int o=0;o<plateau.length;o++) {
				if(plateau[i][i]==piece){
					trouve =true;
					break;
				}
			}
			if(trouve)break;
		}
		
		return false;
	}
	
}

