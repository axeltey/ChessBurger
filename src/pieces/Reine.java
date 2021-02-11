package pieces;
import Principal.*;

public class Reine extends Pieces{

	public Reine(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "reine " + super.toString();
	}
}
