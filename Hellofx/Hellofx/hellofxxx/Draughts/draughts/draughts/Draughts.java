package draughts;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Draughts implements Serializable {
	private static boolean gameEnd = false;
	public boolean validInput = false;
	public Colour turn;
	public Boolean turnEnd = true;
	private CheckInput ch = new CheckInput();;
	public CheckerBoard b;
	public String debug1;
	public String destinationDebug;
	public String originDebug;
	public int boran = 1;

	// Main constructor method for new games
	public Draughts() throws Exception {
		turn = Colour.WHITE;
		this.b = new CheckerBoard();
		b.initialisePieces();
		gameEnd = false;

		boran = 2;

	}

	// Main constructor method for loading games
	public Draughts(CheckerBoard b) throws Exception {
		turn = Colour.WHITE;
		this.b = b;
		gameEnd = false;

		boran = 3;

	}

	// Main Game loop
	// Checks the input and moves the pieces
	public boolean play(String originDebu, String destinationDebu) throws Exception {
		Console originConsole;
		Console destinationConsole;
		String inputOrigin;
		String inputDestination;
		Colour turnColour;
		int[] arrayOrigin;
		int[] arrayDestination;
		arrayOrigin = inputTaker(originDebu, "origin");
		if (gameEnd == false) {
			arrayDestination = inputTaker(destinationDebu, "destination");
		} else {
			arrayDestination = null;
			System.exit(0);
		}

		if (gameEnd == false) {
			Piece piece = b.getPiece(arrayOrigin[0], arrayOrigin[1]);
			System.out.println(piece.getToEatCoordinates());
			if (piece.check(arrayOrigin[0], arrayOrigin[1], arrayDestination[0], arrayDestination[1], b)) {
				if (b.hasPiece(arrayDestination[0], arrayDestination[1])
						&& b.getPiece(arrayDestination[0], arrayDestination[1]).getColour() == turn) {
					return false;

				} else {

					gameEnd = b.movePiece(arrayOrigin[0], arrayOrigin[1], arrayDestination[0], arrayDestination[1],
							b.getPiece(arrayOrigin[0], arrayOrigin[1]), piece.getToEatCoordinates());
					if (gameEnd) {
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

	public int[] inputTaker(String inputConsole, String debug) throws Exception {
		String input = inputConsole;
		String end = "END";
		String end1 = "end";

		debug1 = debug;
		if (input.equals(end) || input.equals(end1)) {
			gameEnd = true;
			validInput = false;
		}

		if (!ch.checkCoordinateValidity(input)) {
			System.out.println("Invalid " + debug + ", try again!");
			input = System.console().readLine("Enter " + debug + ":");
		} else if (ch.checkCoordinateValidity(input)) {
			// extract string
			int[] inputs = ch.extractInputs(input);
			if (debug == "origin") {
				if (!b.hasPiece(inputs[0], inputs[1])) {
					b.printBoard();
					System.out.println("Invalid " + debug + ", try again!");
					input = System.console().readLine("Enter " + debug + ":");
					turnEnd = false;

				} else if (b.getPiece(inputs[0], inputs[1]).getColour() == turn) {
					return inputs;

				} else {
					b.printBoard();
					System.out.println("It's not your piece!");
					System.out.println("Try again!");
					input = System.console().readLine("Enter " + debug + ":");
					turnEnd = false;
				}
			} else {
				return inputs;
			}
		}

		return null;
	}

	public Colour getTurnColor() {
		return turn;
	}

}
