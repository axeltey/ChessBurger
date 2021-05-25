package principal;

import cases.Piece;

public class Case {
	private Piece  piece;
	
	public Case(Piece piece) {
		this.piece=piece;
	}
	
	public Case() {
		this.piece=null;
	}
	
	public boolean ajoutPiece(Piece piece) {
		if(!(this.piece==null)) {
			this.piece=piece;
			return false;
		}else {
			return true;
		}
	}

	public Piece getPiece() {
		return piece;
	}
}
