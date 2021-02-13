package pieces;
import Principal.*;

public class Cavalier extends Pieces{
	
	public Cavalier(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "cavalier " + super.toString();
	}
}
