package pieces;
import Principal.*;

public class Reine extends Piece{

	public Reine(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "reine " + super.toString();
	}
}
