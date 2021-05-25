package cases;
import principal.*;

public class Cavalier extends Piece{
	
	public Cavalier(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "cavalier " + super.toString();
	}
}
