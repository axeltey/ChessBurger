package principal;
import java.io.IOException;

import cases.*;

public class ChessBurger {
	
	 static Plateau plateau;
	 //static int [] i = {6,2};	//TEST
	 //static Pion p = new Pion(Couleur.BLANC);	//TEST
	
	ChessBurger() throws IOException {
		plateau = new Plateau();
	}
	
	public static void main(String[] args) throws IOException {
		ChessBurger jeu = new ChessBurger();
		//System.out.println(plateau.toString());
		//System.out.println(p.deplacements(i,plateau).toString());	//TEST MARCHE PAS
	}
}
 