package pieces;

import Principal.*;
import Principal.Pieces;

public class Pion extends Pieces{

	public Pion(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "pion " + super.toString();
	}
	
}
