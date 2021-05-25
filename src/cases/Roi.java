package cases;
import principal.*;

public class Roi extends Piece{

	public Roi(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "roi " + super.toString();
	}
}
