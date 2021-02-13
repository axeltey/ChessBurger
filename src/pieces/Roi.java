package pieces;
import Principal.*;

public class Roi extends Pieces{

	public Roi(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "roi " + super.toString();
	}
}
