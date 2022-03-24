package draughts;

import java.io.Serializable;

//This class is partially implemented
public class Square implements Serializable {
	private int i;
	private int j;
	private boolean hasPiece;
	private Piece p;

	public Square(int iIn, int jIn) {
		i = iIn;
		j = jIn;
	}

	public Piece getPiece() {
		return p;
	}

	public void setPiece(Piece p) {
		this.hasPiece = true;
		this.p = p;
	}

	public void removePiece() {
		this.hasPiece = false;
		this.p = null;
		// this.p = new Piece();
	}

	public int getI() {
		return this.i;
	}

	public int getJ() {
		return this.j;
	}

	public boolean hasPiece() {
		return this.hasPiece;
	}

}
