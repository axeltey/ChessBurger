package pieces;
import Principal.*;

public class Fou extends Pieces{

	public Fou(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "fou " + super.toString();
	}
}
