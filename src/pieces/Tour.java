package pieces;

import Principal.*;

public class Tour extends Pieces{

	public Tour(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "tour " + super.toString();
	}
}
