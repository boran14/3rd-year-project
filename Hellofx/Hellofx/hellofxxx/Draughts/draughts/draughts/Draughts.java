package draughts;

import java.io.Serializable;

public class Draughts implements Serializable {
	private static boolean isFinished = false;
	public boolean validInput = false;
	public Colour turn;
	public Boolean turnEnd = true;
	private CheckInput ch = new CheckInput();;
	public CheckerBoard b;
	public String debug1;
	public String finishCoordg;
	public int boran = 1;

	// Main constructor method for new games
	public Draughts() throws Exception {
		turn = Colour.WHITE;
		this.b = new CheckerBoard();
		b.initialisePieces();
		isFinished = false;

		boran = 2;

	}

	// Main constructor method for loading games
	public Draughts(CheckerBoard b) throws Exception {
		turn = Colour.WHITE;
		this.b = b;
		isFinished = false;

		boran = 3;

	}

	// Main Game loop
	// Checks the point and moves the pieces
	public boolean play(String startCoord, String finishCoord) throws Exception {
		int[] startPoint;
		int[] finishPoint;
		startPoint = convertCoordinates(startCoord, "origin");
		if (isFinished == false) {
			finishPoint = convertCoordinates(finishCoord, "destination");
		} else {
			finishPoint = null;
			System.exit(0);
		}

		if (isFinished == false) {
			Piece piece = b.getPiece(startPoint[0], startPoint[1]);
			//System.out.println(piece.getToEatCoordinates());
			if (piece.check(startPoint[0], startPoint[1], finishPoint[0], finishPoint[1], b)) {
				if (b.hasPiece(finishPoint[0], finishPoint[1])
						&& b.getPiece(finishPoint[0], finishPoint[1]).getColour() == turn) {
					return false;

				} else {

					isFinished = b.movePiece(startPoint[0], startPoint[1], finishPoint[0], finishPoint[1],
							b.getPiece(startPoint[0], startPoint[1]), piece.getToEatCoordinates());
					if (isFinished) {
						return false;
					}
					turnManeger();
					return true;
				}
			} else {
				return false;

			}
		}
		return false;
	}

	// Turn manager to alternate between colors/players
	public void turnManeger() {
		if (turn == Colour.WHITE) {
			turn = Colour.BLACK;

		} else if (turn == Colour.BLACK) {
			turn = Colour.WHITE;
		}
	}

	public int[] convertCoordinates(String coords, String debug) throws Exception {
		String point = coords;

		debug1 = debug;
		if (point.equals("END") || point.equals("end")) {
			isFinished = true;
			validInput = false;
		}

		if (!ch.coordinateChecker(point)) {
		} else if (ch.coordinateChecker(point)) {
			// extract string
			int[] points = ch.preparePointCoordinates(point);
			if (debug == "origin") {
				if (!b.hasPiece(points[0], points[1])) {
					b.printBoard();
					turnEnd = false;

				} else if (b.getPiece(points[0], points[1]).getColour() == turn) {
					return points;

				} else {
					b.printBoard();
					turnEnd = false;
				}
			} else {
				return points;
			}
		}

		return null;
	}

	public Colour getTurnColor() {
		return turn;
	}

}
