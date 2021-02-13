package Principal;
import pieces.*;

public class ChessBurger {
	
	 static Plateau plateau;
	 static int [] i = {6,2};	//TEST
	 static Pion p = new Pion(Couleur.BLANC);	//TEST
	
	ChessBurger() {
		plateau = new Plateau();
	}

	void AffichePlateau() {		//Visuel javafx
		
	}
	
	public static void main(String[] args) {
		ChessBurger jeu = new ChessBurger();
		System.out.println(plateau.toString());
		System.out.println(p.deplacements(i,plateau).toString());	//TEST MARCHE PAS
	}
}
 