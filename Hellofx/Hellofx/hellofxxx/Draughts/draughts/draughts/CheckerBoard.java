package draughts;

import java.io.Serializable;
import java.util.*;
import java.util.ArrayList;

import javafx.scene.paint.Color;

public class CheckerBoard implements Serializable {
	private Square[][] board = new Square[10][10];
	public int turn_count;

	// Creates a 10x10 array with each element being a special Square class data
	// type
	public CheckerBoard() {
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board[1].length; j++)
				board[i][j] = new Square(i, j);
		}

		turn_count = 0;
	}

	public Square[][] getBoard() {
		return board;
	}

	public int getBoardSize() {
		return board.length;
	}

	public void setBoard(Square[][] board11) {
		this.board = board11;
	}

	// Initialises pieces and places them on board
	public void initialisePieces() {

		boolean rowAlternate = false;
		boolean isWhite = false;
		int i = 0;
		int j = 1;
		turn_count = 0;
		while (i < getBoardSize()) {
			if (i == 4 || i == 5) {
				i++;
				continue;
			}
			if (i > 4) {
				isWhite = true;
			}

			rowAlternate = !rowAlternate;
			if (rowAlternate) {
				j = 1;
			} else if (!rowAlternate) {
				j = 0;
			}

			while (j < getBoardSize()) {
				if (isWhite) {
					Men whMen = new Men(Colour.WHITE); // Create white Men
					setPiece(i, j, whMen); // Place white Men
				} else if (!isWhite) {
					Men blMen = new Men(Colour.BLACK); // Create white Men
					setPiece(i, j, blMen); // Place white Men
				}
				j += 2;
				if (j >= getBoardSize()) {
					i++;
				}
			}

		}

	}

	// Used in early development
	public void printBoard() {

	}

	// Moves the pieces and removes any piece that is captured
	public boolean movePiece(int i0, int j0, int i1, int j1, Piece p, ArrayList<ArrayList<ArrayList<Integer>>> toEat) {

		if (!toEat.isEmpty()) {
			for (ArrayList<ArrayList<Integer>> coord : toEat) {
				if (coord.get(0).get(0) == i1 && coord.get(0).get(1) == j1) {
					for (int i = 1; i < coord.size(); i++) {
						board[coord.get(i).get(0)][coord.get(i).get(1)].removePiece();

					}
					break;

				}

			}
		}

		board[i0][j0].removePiece();
		board[i1][j1].setPiece(p);
		if (board[i1][j1].getPiece().getColour() == Colour.WHITE && i1 == 0) {
			board[i1][j1].removePiece();
			King whMen = new King(Colour.WHITE); // Create white Men
			setPiece(i1, j1, whMen); // Place white Men
		} else if (board[i1][j1].getPiece().getColour() == Colour.BLACK && i1 == 9) {
			board[i1][j1].removePiece();
			King whMen = new King(Colour.BLACK); // Create white Men
			setPiece(i1, j1, whMen); // Place white Men
		}

		if (getPieceNumber(Colour.WHITE) == 0 || getPieceNumber(Colour.BLACK) == 0) {
			return true;

		}

		turn_count++;
		return false;

	}

	public void setPiece(int iIn, int jIn, Piece p) {
		board[iIn][jIn].setPiece(p);
	}

	public int getPieceNumber(Colour color) {
		int total = 0;
		for (Square[] sq : board) {
			for (Square su : sq) {
				if (su.hasPiece()) {
					if (su.getPiece().getColour() == color) {
						total++;
					}
				}
			}
		}

		return total;
	}

	public Piece getPiece(int iIn, int jIn) {
		return board[iIn][jIn].getPiece();
	}

	public boolean hasPiece(int i, int j) {
		return board[i][j].hasPiece();
	}

	public int getTurnNo() {
		return turn_count;
	}

}
