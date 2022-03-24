package draughts;

import java.io.Serializable;
import java.util.ArrayList;

public class Men extends Piece implements Serializable {
	Square[][] board1 = new Square[10][10];
	Piece p;
	ArrayList<ArrayList<Integer>> moveableCoordinates;
	ArrayList<ArrayList<Integer>> toEat;
	ArrayList<ArrayList<ArrayList<Integer>>> toEatAll;
	ArrayList<Piece> already_eaten;

	public Men(Colour colour) {
		this.colour = colour;
		switch (colour) {
			case WHITE:
				this.setSymbol("\u2655"); // symbol decleration for white king
				break;
			case BLACK:
				this.setSymbol("\u265B"); // symbol decleration for black king
				break;
		}
	}

	public boolean check(int i, int j, int k, int l, CheckerBoard board11) {

		return true;

	}

	// Multiple eat detection algorithm for more than one piece capture moves.
	// Searches all sides for a possible move and discoveres that side fully before
	// coming back
	public void computeMoveableCoordinatesComplex(int i, int j, CheckerBoard board11, Colour current_color) {
		ArrayList<Integer> coordinates;
		ArrayList<Integer> toEatCoordinates;
		ArrayList<ArrayList<Integer>> coordinates_2d;
		this.board1 = board11.getBoard();

		if (current_color == Colour.BLACK && j < board11.getBoardSize() - 1 && j > 0) {
			if (i < board11.getBoardSize() - 2 && j < board11.getBoardSize() - 2) {
				if (board1[i + 1][j + 1].hasPiece() && board1[i + 1][j + 1].getPiece().getColour() != current_color
						&& !board1[i + 2][j + 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i + 1, j + 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

			if (i < board11.getBoardSize() - 2 && j >= 2) {
				if (board1[i + 1][j - 1].hasPiece() && board1[i + 1][j - 1].getPiece().getColour() != current_color
						&& !board1[i + 2][j - 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i + 1, j - 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

			if (j < board11.getBoardSize() - 2 && i >= 2) {
				if (board1[i - 1][j + 1].hasPiece() && board1[i - 1][j + 1].getPiece().getColour() != current_color
						&& !board1[i - 2][j + 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i - 1, j + 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}

				}
			}

			if (j >= 2 && i >= 2) {
				if (board1[i - 1][j - 1].hasPiece() && board1[i - 1][j - 1].getPiece().getColour() != current_color
						&& !board1[i - 2][j - 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i - 1, j - 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

		} else if (current_color == Colour.WHITE && j < board11.getBoardSize() - 1 && j > 0) {
			if (i < board11.getBoardSize() - 2 && j < board11.getBoardSize() - 2) {
				if (board1[i + 1][j + 1].hasPiece() && board1[i + 1][j + 1].getPiece().getColour() != current_color
						&& !board1[i + 2][j + 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i + 1, j + 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}

				}
			}

			if (i < board11.getBoardSize() - 2 && j >= 2) {
				if (board1[i + 1][j - 1].hasPiece() && board1[i + 1][j - 1].getPiece().getColour() != current_color
						&& !board1[i + 2][j - 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i + 1, j - 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

			if (j < board11.getBoardSize() - 2 && i >= 2) {
				if (board1[i - 1][j + 1].hasPiece() && board1[i - 1][j + 1].getPiece().getColour() != current_color
						&& !board1[i - 2][j + 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i - 1, j + 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

			if (j >= 2 && i >= 2) {
				if (board1[i - 1][j - 1].hasPiece() && board1[i - 1][j - 1].getPiece().getColour() != current_color
						&& !board1[i - 2][j - 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i - 1, j - 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

		} else if (current_color == Colour.WHITE && j == board11.getBoardSize() - 1) {
			if (i < board11.getBoardSize() - 2 && j >= 2) {
				if (board1[i + 1][j - 1].hasPiece() && board1[i + 1][j - 1].getPiece().getColour() != current_color
						&& !board1[i + 2][j - 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i + 1, j - 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

			if (j >= 2 && i >= 2) {
				if (board1[i - 1][j - 1].hasPiece() && board1[i - 1][j - 1].getPiece().getColour() != current_color
						&& !board1[i - 2][j - 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i - 1, j - 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

		} else if (current_color == Colour.WHITE && j == 0) {
			if (j < board11.getBoardSize() - 2 && i < board11.getBoardSize() - 2) {
				if (board1[i + 1][j + 1].hasPiece() && board1[i + 1][j + 1].getPiece().getColour() != current_color
						&& !board1[i + 2][j + 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i + 1, j + 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

			if (j < board11.getBoardSize() - 2 && i >= 2) {
				if (board1[i - 1][j + 1].hasPiece() && board1[i - 1][j + 1].getPiece().getColour() != current_color
						&& !board1[i - 2][j + 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i - 1, j + 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

		} else if (current_color == Colour.BLACK && j == board11.getBoardSize() - 1) {
			if (i < board11.getBoardSize() - 2 && j >= 2) {
				if (board1[i + 1][j - 1].hasPiece() && board1[i + 1][j - 1].getPiece().getColour() != current_color
						&& !board1[i + 2][j - 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i + 1, j - 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

			if (j >= 2 && i >= 2) {
				if (board1[i - 1][j - 1].hasPiece() && board1[i - 1][j - 1].getPiece().getColour() != current_color
						&& !board1[i - 2][j - 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i - 1, j - 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

		} else if (current_color == Colour.BLACK && j == 0) {
			if (i < board11.getBoardSize() - 2 && j < board11.getBoardSize() - 2) {
				if (board1[i + 1][j + 1].hasPiece() && board1[i + 1][j + 1].getPiece().getColour() != current_color
						&& !board1[i + 2][j + 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i + 1, j + 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

			if (j < board11.getBoardSize() - 2 && i >= 2) {
				if (board1[i - 1][j + 1].hasPiece() && board1[i - 1][j + 1].getPiece().getColour() != current_color
						&& !board1[i - 2][j + 2].hasPiece()
						&& !already_eaten.contains(board11.getPiece(i - 1, j + 1))) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, current_color);

					toEat.clear();
					for (ArrayList<Integer> ch : hold) {
						toEat.add(ch);
					}
				}
			}

		}
	}

	// Search algorithm for one piece captures.
	// Calls the complex algorithm to check possible extra moves
	public ArrayList<ArrayList<Integer>> computeMoveableCoordinates(int i, int j, CheckerBoard board11) {
		ArrayList<Integer> coordinates;
		ArrayList<Integer> toEatCoordinates;
		ArrayList<ArrayList<Integer>> coordinates_2d;
		moveableCoordinates = new ArrayList<ArrayList<Integer>>();

		toEatAll = new ArrayList<ArrayList<ArrayList<Integer>>>();
		already_eaten = new ArrayList<Piece>();
		this.board1 = board11.getBoard();
		p = board11.getPiece(i, j);

		if (board1[i][j].getPiece().getColour() == Colour.BLACK && j < board11.getBoardSize() - 1 && j > 0
				&& i < board11.getBoardSize() - 1) {
			if (!board1[i + 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);
				moveableCoordinates.add(coordinates);
			}

			if (!board1[i + 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);
				moveableCoordinates.add(coordinates);
			}

			if (i < board11.getBoardSize() - 2 && j < board11.getBoardSize() - 2) {
				if (board1[i + 1][j + 1].hasPiece()
						&& board1[i + 1][j + 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i + 2][j + 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (i < board11.getBoardSize() - 2 && j >= 2) {
				if (board1[i + 1][j - 1].hasPiece()
						&& board1[i + 1][j - 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i + 2][j - 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (j < board11.getBoardSize() - 2 && i >= 2) {
				if (board1[i - 1][j + 1].hasPiece()
						&& board1[i - 1][j + 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i - 2][j + 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (j >= 2 && i >= 2) {
				if (board1[i - 1][j - 1].hasPiece()
						&& board1[i - 1][j - 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i - 2][j - 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, board1[i][j].getPiece().getColour());
				}
			}

		} else if (board1[i][j].getPiece().getColour() == Colour.WHITE && j < board11.getBoardSize() - 1 && j > 0
				&& i > 0) {
			if (!board1[i - 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);
				moveableCoordinates.add(coordinates);

			}

			if (!board1[i - 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);
				moveableCoordinates.add(coordinates);
			}

			if (i < board11.getBoardSize() - 2 && j < board11.getBoardSize() - 2) {
				if (board1[i + 1][j + 1].hasPiece()
						&& board1[i + 1][j + 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i + 2][j + 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (i < board11.getBoardSize() - 2 && j >= 2) {
				if (board1[i + 1][j - 1].hasPiece()
						&& board1[i + 1][j - 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i + 2][j - 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (j < board11.getBoardSize() - 2 && i >= 2) {
				if (board1[i - 1][j + 1].hasPiece()
						&& board1[i - 1][j + 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i - 2][j + 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (j >= 2 && i >= 2) {
				if (board1[i - 1][j - 1].hasPiece()
						&& board1[i - 1][j - 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i - 2][j - 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, board1[i][j].getPiece().getColour());
				}
			}

		} else if (board1[i][j].getPiece().getColour() == Colour.WHITE && j == board11.getBoardSize() - 1 && i > 0) {
			if (!board1[i - 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);
				moveableCoordinates.add(coordinates);

			}

			if (i < board11.getBoardSize() - 2 && j >= 2) {
				if (board1[i + 1][j - 1].hasPiece()
						&& board1[i + 1][j - 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i + 2][j - 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (j >= 2 && i >= 2) {
				if (board1[i - 1][j - 1].hasPiece()
						&& board1[i - 1][j - 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i - 2][j - 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, board1[i][j].getPiece().getColour());
				}
			}

		} else if (board1[i][j].getPiece().getColour() == Colour.WHITE && j == 0 && i > 0) {
			if (!board1[i - 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);
			}

			if (j < board11.getBoardSize() - 2 && i < board11.getBoardSize() - 2) {
				if (board1[i + 1][j + 1].hasPiece()
						&& board1[i + 1][j + 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i + 2][j + 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (j < board11.getBoardSize() - 2 && i >= 2) {
				if (board1[i - 1][j + 1].hasPiece()
						&& board1[i - 1][j + 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i - 2][j + 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, board1[i][j].getPiece().getColour());
				}
			}

		} else if (board1[i][j].getPiece().getColour() == Colour.BLACK && j == board11.getBoardSize() - 1
				&& i < board11.getBoardSize() - 1) {

			if (!board1[i + 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);
				moveableCoordinates.add(coordinates);
			}

			if (i < board11.getBoardSize() - 2 && j >= 2) {
				if (board1[i + 1][j - 1].hasPiece()
						&& board1[i + 1][j - 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i + 2][j - 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (j >= 2 && i >= 2) {
				if (board1[i - 1][j - 1].hasPiece()
						&& board1[i - 1][j - 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i - 2][j - 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, board1[i][j].getPiece().getColour());
				}
			}

		} else if (board1[i][j].getPiece().getColour() == Colour.BLACK && j == 0 && i < board11.getBoardSize() - 1) {

			if (!board1[i + 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);
				moveableCoordinates.add(coordinates);
			}

			if (i < board11.getBoardSize() - 2 && j < board11.getBoardSize() - 2) {
				if (board1[i + 1][j + 1].hasPiece()
						&& board1[i + 1][j + 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i + 2][j + 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, board1[i][j].getPiece().getColour());
				}
			}

			if (j < board11.getBoardSize() - 2 && i >= 2) {
				if (board1[i - 1][j + 1].hasPiece()
						&& board1[i - 1][j + 1].getPiece().getColour() != board1[i][j].getPiece().getColour()
						&& !board1[i - 2][j + 2].hasPiece()) {

					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat = new ArrayList<ArrayList<Integer>>();

					toEat.add(toEatCoordinates);
					moveableCoordinates.add(coordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, board1[i][j].getPiece().getColour());
				}
			}

		}

		return moveableCoordinates;
	}

	public ArrayList<ArrayList<Integer>> getEatableCoordinates(ArrayList<ArrayList<ArrayList<Integer>>> toEatAllMark,
			int i1, int j1) {
		ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
		if (!toEatAllMark.isEmpty()) {
			for (ArrayList<ArrayList<Integer>> coord : toEatAllMark) {
				for (ArrayList<Integer> coordinate : coord) {
					if (coordinate.get(0) == i1 && coordinate.get(1) == j1) {
						for (int i = 1; i < coord.size(); i++) {
							ArrayList<Integer> cd = new ArrayList<Integer>();
							cd.add(coord.get(i).get(0));
							cd.add(coord.get(i).get(1));
						}
					}
				}
			}
		}
		return coordinates;
	}

	public ArrayList<ArrayList<Integer>> getMoveableCoordinates() {
		return moveableCoordinates;
	}

	public ArrayList<ArrayList<ArrayList<Integer>>> getToEatCoordinates() {
		return toEatAll;
	}

}