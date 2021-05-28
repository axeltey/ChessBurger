package principal;

import java.io.IOException;

import cases.*;
import vue.InterfacePlateau;

public class Plateau {
	
	InterfacePlateau plateau;
	
	private Case [][] cases; //je suis pas sûr du public mais j en ai besoin pour y acceder pour les deplacements ...
	
	Plateau() throws IOException {
		//cases = new Case [8][8];
		//initialiseCases();
		//initialisePlateau();
		plateau=new InterfacePlateau();
		Pion pion = new Pion(Couleur.BLANC);
		pion.afficherPiece("../ressources/images/pionBlanc.png", 0, 0,plateau.getPlateau());
	}
	
	private void initialiseCases() {
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				cases[x][y]=new Case();
			}
		}
	}

	private void initialisePlateau() {
		for (int i=0;i<8;i++) {
			cases[1][i].ajoutPiece(new Pion(Couleur.values()[0]));
			cases[6][i].ajoutPiece(new Pion(Couleur.values()[1]));
		}
		cases[0][0].ajoutPiece(new Tour(Couleur.values()[0]));
		cases[0][7].ajoutPiece(new Tour(Couleur.values()[0]));
		cases[7][0].ajoutPiece(new Tour(Couleur.values()[1]));
		cases[7][7].ajoutPiece(new Tour(Couleur.values()[1]));
		cases[0][1].ajoutPiece(new Cavalier(Couleur.values()[0]));
		cases[0][6].ajoutPiece(new Cavalier(Couleur.values()[0]));
		cases[7][1].ajoutPiece(new Cavalier(Couleur.values()[1]));
		cases[7][6].ajoutPiece(new Cavalier(Couleur.values()[1]));
		cases[0][2].ajoutPiece(new Fou(Couleur.values()[0]));
		cases[0][5].ajoutPiece(new Fou(Couleur.values()[0]));
		cases[7][2].ajoutPiece(new Fou(Couleur.values()[1]));
		cases[7][5].ajoutPiece(new Fou(Couleur.values()[1]));
		cases[0][3].ajoutPiece(new Reine(Couleur.values()[0]));
		cases[7][3].ajoutPiece(new Reine(Couleur.values()[1]));
		cases[0][4].ajoutPiece(new Roi(Couleur.values()[0]));
		cases[7][4].ajoutPiece(new Roi(Couleur.values()[1]));
		cases[0][0].ajoutPiece(new Tour(Couleur.values()[0]));
	}
	
	
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<8;i++) {
			s+="[ ";
			for(int j=0;j<8;j++) {
				s+=cases[i][j]+" ";
			}
			s+="]\n";
		}
		return s;
	}
	
	
	public boolean deplacementPossible(Piece piece, int x,int y){
		boolean trouve=false;
		for(int i=0;i<cases.length;i++) {
			for(int o=0;o<cases.length;o++) {
				if(cases[i][i].getPiece()==piece){
					trouve =true;
					break;
				}
			}
			if(trouve)break;
		}
		
		return false;
	}

	public Case[][] getCases() {
		return cases;
	}
	
	public int[] getPossition(Piece piece){
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				if(cases[x][y].getPiece()==piece) {
					int[] tab =new int[2];
					tab[0]=x;
					tab[1]=y;
					return tab;
				}
			}
		}
		return null;
	}

}

