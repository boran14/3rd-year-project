package draughts;

import java.io.Serializable;
import java.util.ArrayList;

public class King extends Piece implements Serializable {
	Square[][] board1 = new Square[10][10];
	Piece p;
	ArrayList<ArrayList<Integer>> moveableCoordinates;
	ArrayList<ArrayList<Integer>> toEat;
	ArrayList<ArrayList<ArrayList<Integer>>> toEatAll;
	ArrayList<Piece> already_eaten;
	ArrayList<ArrayList<Integer>> coordinates_2d_after_eat;
	ArrayList<Direction> after_eat_direction;
	Boolean after_Eat = false;
	Boolean after_Eat_complex = false;

	public King(Colour colour) {
		this.colour = colour;
		switch (colour) {
			case WHITE:
				this.setSymbol("\u2656"); // symbol decleration for white king
				break;
			case BLACK:
				this.setSymbol("\u265C"); // symbol decleration for black king
				break;
		}
	}

	public boolean isLegitMove(int i, int j, int k, int l, CheckerBoard board11) {
		this.board1 = board11.getBoard();
		int d;
		int f;
		d = k - i; // difference of rows
		f = l - j; // difference of columns
		return true;
	}

	public void computeMoveableCoordinatesComplexAfterEat(int i, int j, CheckerBoard board11, Colour current_color,
			Direction dr) {
		ArrayList<Integer> coordinates;
		ArrayList<Integer> toEatCoordinates;
		ArrayList<ArrayList<Integer>> coordinates_2d;
		this.board1 = board11.getBoard();

		if (j < board11.getBoardSize() - 1 && j > 0 && i < board11.getBoardSize() - 1 && i > 0) {
			if (!board1[i + 1][j + 1].hasPiece() && dr == Direction.SW) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 1);
					coordinates.add(j + 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i + 1, j + 1, board11, current_color, Direction.SW);
			}

			else if (board1[i + 1][j + 1].hasPiece() && j < board11.getBoardSize() - 2 && i < board11.getBoardSize() - 2
					&& dr == Direction.SW) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
						}
					}

				}
			}

			else if (!board1[i + 1][j - 1].hasPiece() && dr == Direction.SE) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 1);
					coordinates.add(j - 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i + 1, j - 1, board11, current_color, Direction.SE);
			}

			else if (board1[i + 1][j - 1].hasPiece() && j > 1 && i < board11.getBoardSize() - 2 && dr == Direction.SE) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, Direction.SE);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
						}
					}

				}
			}

			else if (!board1[i - 1][j - 1].hasPiece() && dr == Direction.NE) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 1);
					coordinates.add(j - 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, Direction.NE);
			}

			else if (board1[i - 1][j - 1].hasPiece() && j > 1 && i > 1 && dr == Direction.NE) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
						}
					}

				}
			}

			else if (!board1[i - 1][j + 1].hasPiece() && dr == Direction.NW) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 1);
					coordinates.add(j + 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

				}
				computeMoveableCoordinatesComplexAfterEat(i - 1, j + 1, board11, current_color, Direction.NW);
			}

			else if (board1[i - 1][j + 1].hasPiece() && j < board11.getBoardSize() - 2 && i > 1 && dr == Direction.NW) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, Direction.NW);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
						}
					}

				}
			}

		} else if (j == 0 && i > 0 && i < board11.getBoardSize() - 1) {
			if (!board1[i - 1][j + 1].hasPiece() && dr == Direction.NW) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 1);
					coordinates.add(j + 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i - 1, j + 1, board11, current_color, Direction.NW);
			} else if (!board1[i + 1][j + 1].hasPiece() && dr == Direction.SW) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 1);
					coordinates.add(j + 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i + 1, j + 1, board11, current_color, Direction.SW);

			} else if (board1[i - 1][j + 1].hasPiece() && j == 0 && i > 1 && i < board11.getBoardSize() - 2
					&& dr == Direction.NW) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, Direction.NW);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
						}
					}

				}

			} else if (board1[i + 1][j + 1].hasPiece() && j == 0 && i > 1 && i < board11.getBoardSize() - 2
					&& dr == Direction.SW) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
						}
					}

				}

			}

		} else if (j == board11.getBoardSize() - 1 && i > 0 && i < board11.getBoardSize() - 1) {
			if (!board1[i - 1][j - 1].hasPiece() && dr == Direction.NE) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 1);
					coordinates.add(j - 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, Direction.NE);
			}

			else if (!board1[i + 1][j - 1].hasPiece() && dr == Direction.SE) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 1);
					coordinates.add(j - 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i + 1, j - 1, board11, current_color, Direction.SE);

			} else if (board1[i - 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1 && i > 1
					&& i < board11.getBoardSize() - 2 && dr == Direction.NE) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
						}
					}

				}

			} else if (board1[i + 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1 && i > 1
					&& i < board11.getBoardSize() - 2 && dr == Direction.NE) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, Direction.NE);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
						}
					}

				}

			}

		} else if (j == 0 && i == 0) {
			if (!board1[i + 1][j + 1].hasPiece() && dr == Direction.SW) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 1);
					coordinates.add(j + 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i + 1, j + 1, board11, current_color, Direction.SW);

			} else if (board1[i + 1][j + 1].hasPiece() && j == 0 && i == 0 && dr == Direction.SW) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
						}
					}

				}

			}
		}

		else if (j == board11.getBoardSize() - 1 && i == 0) {
			if (!board1[i + 1][j - 1].hasPiece() && dr == Direction.SE) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 1);
					coordinates.add(j - 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i + 1, j - 1, board11, current_color, Direction.SE);

			} else if (board1[i + 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1 && i == 0
					&& dr == Direction.SE) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, Direction.SE);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
						}
					}

				}

			}
		}

		else if (j == 0 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j + 1].hasPiece() && dr == Direction.NW) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 1);
					coordinates.add(j + 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

				}
				computeMoveableCoordinatesComplexAfterEat(i - 1, j + 1, board11, current_color, Direction.NW);

			} else if (board1[i - 1][j + 1].hasPiece() && j == 0 && i == board11.getBoardSize() - 1
					&& dr == Direction.NW) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, Direction.NW);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
						}
					}

				}

			}
		}

		else if (j == board11.getBoardSize() - 1 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j - 1].hasPiece() && dr == Direction.NE) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 1);
					coordinates.add(j - 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, Direction.NE);

			} else if (board1[i - 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1
					&& i == board11.getBoardSize() - 1 && dr == Direction.NE) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
						}
					}

				}

			}
		}

		else if (j > 0 && j < board11.getBoardSize() - 1 && i == 0) {
			if (!board1[i + 1][j - 1].hasPiece() && dr == Direction.SE) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 1);
					coordinates.add(j - 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i + 1, j - 1, board11, current_color, Direction.SE);

			} else if (board1[i + 1][j - 1].hasPiece() && j > 0 && j < board11.getBoardSize() - 1 && i == 0
					&& dr == Direction.SE) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, Direction.SE);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
						}
					}

				}

			}

			else if (!board1[i + 1][j + 1].hasPiece() && dr == Direction.SW) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 1);
					coordinates.add(j + 1);
					moveableCoordinates.add(coordinates);
				}
				computeMoveableCoordinatesComplexAfterEat(i + 1, j + 1, board11, current_color, Direction.SW);

			} else if (board1[i + 1][j + 1].hasPiece() && j > 0 && j < board11.getBoardSize() - 1 && i == 0
					&& dr == Direction.SW) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
						}
					}

				}

			}

		} else if (j > 0 && j < board11.getBoardSize() - 1 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j - 1].hasPiece() && dr == Direction.NE) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 1);
					coordinates.add(j - 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, Direction.NE);

			}

			else if (board1[i - 1][j - 1].hasPiece() && j > 0 && j < board11.getBoardSize() - 1
					&& i == board11.getBoardSize() - 1 && dr == Direction.NE) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
						}
					}

				}

			}

			else if (!board1[i - 1][j + 1].hasPiece() && dr == Direction.NW) {
				if (after_Eat_complex) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 1);
					coordinates.add(j + 1);
					moveableCoordinates.add(coordinates);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);
				}
				computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, Direction.NW);

			} else if (board1[i - 1][j + 1].hasPiece() && j > 0 && j < board11.getBoardSize() - 1 && i == 0
					&& dr == Direction.NW) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat_complex = true;
					computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, Direction.NW);
					after_Eat_complex = false;
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
						}
					}

				}

			}
		}

		// toEat.clear();

	}

	public void computeMoveableCoordinatesComplex(int i, int j, CheckerBoard board11, Colour current_color,
			Direction dr) {
		ArrayList<Integer> coordinates;
		ArrayList<Integer> toEatCoordinates;
		ArrayList<ArrayList<Integer>> coordinates_2d;
		this.board1 = board11.getBoard();

		if (j < board11.getBoardSize() - 1 && j > 0 && i < board11.getBoardSize() - 1 && i > 0) {
			if (!board1[i + 1][j + 1].hasPiece() && dr == Direction.SW) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);
				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 1, j + 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				computeMoveableCoordinatesComplex(i + 1, j + 1, board11, current_color, Direction.SW);
			}

			else if (board1[i + 1][j + 1].hasPiece() && j < board11.getBoardSize() - 2 && j > 1
					&& i < board11.getBoardSize() - 2 && i > 1 && dr == Direction.SW) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat = false;
				}
			}

			else if (!board1[i + 1][j - 1].hasPiece() && dr == Direction.SE) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);
				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 1, j - 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				computeMoveableCoordinatesComplex(i + 1, j - 1, board11, current_color, Direction.SE);
			}

			else if (board1[i + 1][j - 1].hasPiece() && j < board11.getBoardSize() - 2 && j > 1
					&& i < board11.getBoardSize() - 2 && i > 1 && dr == Direction.SE) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color, Direction.SE);
					after_Eat = false;
				}
			}

			else if (!board1[i - 1][j - 1].hasPiece() && dr == Direction.NE) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);
				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// if (toEat.size() > 0) {
				// ArrayList<Integer> holdFirstEatenPiece = toEat.get(0);
				// toEat.clear();
				// toEat.add(holdFirstEatenPiece);
				// }

				computeMoveableCoordinatesComplex(i - 1, j - 1, board11, current_color, Direction.NE);
			}

			else if (board1[i - 1][j - 1].hasPiece() && j > 1 && i > 1 && dr == Direction.NE) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat = false;
				}
			}

			else if (!board1[i - 1][j + 1].hasPiece() && dr == Direction.NW) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);
				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE && direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i - 1, j + 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				computeMoveableCoordinatesComplex(i - 1, j + 1, board11, current_color, Direction.NW);
			}

			else if (board1[i - 1][j + 1].hasPiece() && j < board11.getBoardSize() - 2 && i > 1 && dr == Direction.NW) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					// System.out.print("yessss");
					// System.out.println(hold);
					// System.out.print("noooo");
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE && direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					computeMoveableCoordinatesComplex(i - 2, j + 2, board11,
							current_color, Direction.NW);
					after_Eat = false;
				}
			}

		} else if (j == 0 && i > 0 && i < board11.getBoardSize() - 1) {
			if (!board1[i - 1][j + 1].hasPiece() && dr == Direction.NW) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE && direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i - 1, j + 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				computeMoveableCoordinatesComplex(i - 1, j + 1, board11, current_color, Direction.NW);

			} else if (board1[i - 1][j + 1].hasPiece() && j == 0 && i > 1 && dr == Direction.NW) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE && direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i - 2, j + 2, board11,
					// current_color, Direction.NW);
					after_Eat = false;

				}

			}

			else if (!board1[i + 1][j + 1].hasPiece() && dr == Direction.SW) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 1, j + 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i + 1, j + 1, board11, current_color,
				// Direction.SW);

			} else if (board1[i + 1][j + 1].hasPiece() && j == 0 && i < board11.getBoardSize() - 2
					&& dr == Direction.SW) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i + 2, j + 2, board11,
					// current_color, Direction.SW);
					after_Eat = false;

				}

			}

		} else if (j == board11.getBoardSize() - 1 && i > 0 && i < board11.getBoardSize() - 1) {
			if (!board1[i - 1][j - 1].hasPiece() && dr == Direction.NE) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i - 1, j - 1, board11, current_color,
				// Direction.NE);

			} else if (board1[i - 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1 && i > 1
					&& dr == Direction.NE) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i - 2, j - 2, board11,
					// current_color, Direction.NE);
					after_Eat = false;

				}

			}

			else if (!board1[i + 1][j - 1].hasPiece() && dr == Direction.SE) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 1, j - 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i + 1, j - 1, board11, current_color,
				// Direction.SE);

			} else if (board1[i + 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1
					&& i < board11.getBoardSize() - 2 && dr == Direction.SE) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i + 2, j - 2, board11,
					// current_color, Direction.SE);
					after_Eat = false;

				}

			}
		}

		else if (j == 0 && i == 0) {
			if (!board1[i + 1][j + 1].hasPiece() && dr == Direction.SW) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 1, j + 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i + 1, j + 1, board11, current_color,
				// Direction.SW);

			} else if (board1[i + 1][j + 1].hasPiece() && j == 0 && i == 0 && dr == Direction.SW) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i + 2, j + 2, board11,
					// current_color, Direction.SW);
					after_Eat = false;

				}

			}
		}

		else if (j == board11.getBoardSize() - 1 && i == 0) {
			if (!board1[i + 1][j - 1].hasPiece() && dr == Direction.SE) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 1, j - 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i + 1, j - 1, board11, current_color,
				// Direction.SE);

			} else if (board1[i + 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1 && i == 0
					&& dr == Direction.SE) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i + 2, j - 2, board11,
					// current_color, Direction.SE);
					after_Eat = false;

				}

			}
		}

		else if (j == 0 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j + 1].hasPiece() && dr == Direction.NW) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE && direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i - 1, j + 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i - 1, j + 1, board11, current_color,
				// Direction.NW);

			} else if (board1[i - 1][j + 1].hasPiece() && j == 0 && i == board11.getBoardSize() - 1
					&& dr == Direction.NW) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE && direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i - 2, j + 2, board11,
					// current_color, Direction.NW);
					after_Eat = false;

				}

			}
		}

		else if (j == board11.getBoardSize() - 1 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j - 1].hasPiece() && dr == Direction.NE) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i - 1, j - 1, board11, current_color,
				// Direction.NE);

			} else if (board1[i - 1][j - 1].hasPiece() && j == 0 && i == board11.getBoardSize() - 1
					&& dr == Direction.NE) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i - 2, j - 2, board11,
					// current_color, Direction.NE);
					after_Eat = false;

				}

			}
		}
		//////////////////////////////// boran
		else if (j > 0 && j < board11.getBoardSize() - 1 && i == 0) {
			if (!board1[i + 1][j - 1].hasPiece() && dr == Direction.SE) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 1, j - 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i + 1, j - 1, board11, current_color,
				// Direction.SE);

			} else if (board1[i + 1][j - 1].hasPiece() && j > 0 && j < board11.getBoardSize() - 1 && i == 0
					&& dr == Direction.SE) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i + 2, j - 2, board11,
					// current_color, Direction.SE);
					after_Eat = false;

				}

			}

			else if (!board1[i + 1][j + 1].hasPiece() && dr == Direction.SW) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 1, j + 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i + 1, j + 1, board11, current_color,
				// Direction.SE);

			} else if (board1[i + 1][j + 1].hasPiece() && j > 0 && j < board11.getBoardSize() - 1 && i == 0
					&& dr == Direction.SW) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i + 2, j + 2, board11,
					// current_color, Direction.SW);
					after_Eat = false;

				}

			}

		} else if (j > 0 && j < board11.getBoardSize() - 1 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j - 1].hasPiece() && dr == Direction.NE) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 1, j - 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i - 1, j - 1, board11, current_color,
				// Direction.NE);

			}

			else if (board1[i - 1][j - 1].hasPiece() && j > 0 && j < board11.getBoardSize() - 1
					&& i == board11.getBoardSize() - 1 && dr == Direction.NE) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i - 2, j - 2, board11,
					// current_color, Direction.NE);
					after_Eat = false;

				}

			}

			else if (!board1[i - 1][j + 1].hasPiece() && dr == Direction.NW) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				if (after_Eat) {
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE && direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i - 1, j + 1, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
				}

				// computeMoveableCoordinatesComplex(i - 1, j + 1, board11, current_color,
				// Direction.NW);

			} else if (board1[i - 1][j + 1].hasPiece() && j > 0 && j < board11.getBoardSize() - 1 && i == 0
					&& dr == Direction.NW) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					// if(after_Eat){
					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);
					// }

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);

					toEat.add(toEatCoordinates);
					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);
					// toEatAll.add(toEat);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SE && direc != Direction.NW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}
					// computeMoveableCoordinatesComplex(i - 2, j + 2, board11,
					// current_color, Direction.NW);
					after_Eat = false;

				}

			}
		}

		toEat.clear();
	}

	public ArrayList<ArrayList<Integer>> computeMoveableCoordinates(int i, int j, CheckerBoard board11) {
		ArrayList<Integer> coordinates;
		ArrayList<Integer> toEatCoordinates;
		ArrayList<ArrayList<Integer>> coordinates_2d;
		moveableCoordinates = new ArrayList<ArrayList<Integer>>();
		coordinates_2d_after_eat = new ArrayList<ArrayList<Integer>>();
		after_eat_direction = new ArrayList<Direction>();

		toEat = new ArrayList<ArrayList<Integer>>();
		toEatAll = new ArrayList<ArrayList<ArrayList<Integer>>>();
		already_eaten = new ArrayList<Piece>();
		this.board1 = board11.getBoard();
		p = board11.getPiece(i, j);
		Colour current_color = p.getColour();

		if (j < board11.getBoardSize() - 1 && j > 0 && i < board11.getBoardSize() - 1 && i > 0) {
			if (!board1[i + 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);
				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i + 1, j + 1, board11, current_color, Direction.SW);
			}

			else if (board1[i + 1][j + 1].hasPiece() && j < board11.getBoardSize() - 2
					&& i < board11.getBoardSize() - 2) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat = false;
				}
			}

			if (!board1[i + 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);
				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i + 1, j - 1, board11, current_color, Direction.SE);
			}

			else if (board1[i + 1][j - 1].hasPiece() && j > 1
					&& i < board11.getBoardSize() - 2) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;

					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color, Direction.SE);
					after_Eat = false;
				}
			}

			if (!board1[i - 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);
				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i - 1, j - 1, board11, current_color, Direction.NE);
			}

			else if (board1[i - 1][j - 1].hasPiece() && j > 1
					&& i > 1) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat = false;
				}
			}

			if (!board1[i - 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);
				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i - 1, j + 1, board11, current_color, Direction.NW);
			}

			else if (board1[i - 1][j + 1].hasPiece() && j < board11.getBoardSize() - 2
					&& i > 1) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, current_color, Direction.NW);
					after_Eat = false;
				}
			}

		} else if (j == 0 && i > 0 && i < board11.getBoardSize() - 1) {
			if (!board1[i - 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i - 1, j + 1, board11, current_color, Direction.NW);

			} else if (board1[i - 1][j + 1].hasPiece() && j == 0 && i > 1) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, current_color, Direction.NW);
					after_Eat = false;
				}
			}

			if (!board1[i + 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i + 1, j + 1, board11, current_color, Direction.SW);

			} else if (board1[i + 1][j + 1].hasPiece() && j == 0 && i < board11.getBoardSize() - 2) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat = false;
				}
			}

		} else if (j == board11.getBoardSize() - 1 && i > 0 && i < board11.getBoardSize() - 1) {
			if (!board1[i - 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i - 1, j - 1, board11, current_color, Direction.NE);

			} else if (board1[i - 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1 && i > 1) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat = false;
				}
			}

			if (!board1[i + 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i + 1, j - 1, board11, current_color, Direction.SE);

			} else if (board1[i + 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1
					&& i < board11.getBoardSize() - 2) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color, Direction.SE);
					after_Eat = false;
				}
			}
		}

		else if (j == 0 && i == 0) {
			if (!board1[i + 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i + 1, j + 1, board11, current_color, Direction.SW);

			} else if (board1[i + 1][j + 1].hasPiece() && j == 0 && i == 0) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat = false;
				}
			}
		}

		else if (j == board11.getBoardSize() - 1 && i == 0) {
			if (!board1[i + 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i + 1, j - 1, board11, current_color, Direction.SE);

			} else if (board1[i + 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1 && i == 0) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color, Direction.SE);
					after_Eat = false;
				}
			}
		}

		else if (j == 0 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i - 1, j + 1, board11, current_color, Direction.NW);

			} else if (board1[i - 1][j + 1].hasPiece() && j == 0 && i == board11.getBoardSize() - 1) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, current_color, Direction.NW);
					after_Eat = false;
				}
			}
		}

		else if (j == board11.getBoardSize() - 1 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i - 1, j - 1, board11, current_color, Direction.NE);

			} else if (board1[i - 1][j - 1].hasPiece() && j == board11.getBoardSize() - 1
					&& i == board11.getBoardSize() - 1) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat = false;
				}
				/////////////////// borannnnn1
			}
		} else if (j > 0 && j < board11.getBoardSize() - 1 && i == 0) {
			if (!board1[i + 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i + 1, j - 1, board11, current_color, Direction.SE);

			} else if (board1[i + 1][j - 1].hasPiece() && j > 1 && i == 0) {
				if (current_color != board1[i + 1][j - 1].getPiece().getColour() && !board1[i + 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SE);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j - 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i + 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j - 2, board11, current_color, Direction.SE);
					after_Eat = false;
				}
			}
			if (!board1[i + 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i + 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i + 1, j + 1, board11, current_color, Direction.SW);

			} else if (board1[i + 1][j + 1].hasPiece() && j < board11.getBoardSize() - 2 && i == 0) {
				if (current_color != board1[i + 1][j + 1].getPiece().getColour() && !board1[i + 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i + 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.SW);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i + 1);
					toEatCoordinates.add(j + 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i + 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.SW && direc != Direction.NE) {
							computeMoveableCoordinatesComplexAfterEat(i + 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i + 2, j + 2, board11, current_color, Direction.SW);
					after_Eat = false;
				}
			}
		} else if (j > 0 && j < board11.getBoardSize() - 1 && i == board11.getBoardSize() - 1) {
			if (!board1[i - 1][j + 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j + 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i - 1, j + 1, board11, current_color, Direction.NW);

			} else if (board1[i - 1][j + 1].hasPiece() && j < board11.getBoardSize() - 2
					&& i == board11.getBoardSize() - 1) {
				if (current_color != board1[i - 1][j + 1].getPiece().getColour() && !board1[i - 2][j + 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j + 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NW);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j + 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i - 1, j + 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NW && direc != Direction.SE) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j + 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j + 2, board11, current_color, Direction.NW);
					after_Eat = false;
				}
			}
			if (!board1[i - 1][j - 1].hasPiece()) {
				coordinates = new ArrayList<Integer>();
				coordinates.add(i - 1);
				coordinates.add(j - 1);

				moveableCoordinates.add(coordinates);

				computeMoveableCoordinatesComplex(i - 1, j - 1, board11, current_color, Direction.NE);

			} else if (board1[i - 1][j - 1].hasPiece() && j > 1
					&& i == board11.getBoardSize() - 1) {
				if (current_color != board1[i - 1][j - 1].getPiece().getColour() && !board1[i - 2][j - 2].hasPiece()) {
					coordinates = new ArrayList<Integer>();
					coordinates.add(i - 2);
					coordinates.add(j - 2);
					moveableCoordinates.add(coordinates);

					coordinates_2d_after_eat.add(coordinates);
					after_eat_direction.add(Direction.NE);

					toEatCoordinates = new ArrayList<Integer>();
					toEatCoordinates.add(i - 1);
					toEatCoordinates.add(j - 1);
					toEat.add(toEatCoordinates);

					already_eaten.add(board11.getPiece(i - 1, j - 1));

					coordinates_2d = new ArrayList<ArrayList<Integer>>();
					coordinates_2d.add(coordinates);
					for (ArrayList<Integer> bb : toEat) {
						coordinates_2d.add(bb);
					}
					// coordinates_2d.add(toEatCoordinates);
					toEatAll.add(coordinates_2d);

					after_Eat = true;
					ArrayList<ArrayList<Integer>> hold = new ArrayList<ArrayList<Integer>>();

					for (ArrayList<Integer> ch : toEat) {
						hold.add(ch);
					}
					for (Direction direc : Direction.values()) {
						if (direc != Direction.NE && direc != Direction.SW) {
							computeMoveableCoordinatesComplexAfterEat(i - 2, j - 2, board11, current_color, direc);
							toEat.clear();
							for (ArrayList<Integer> ch : hold) {
								toEat.add(ch);
							}
						}
					}

					computeMoveableCoordinatesComplex(i - 2, j - 2, board11, current_color, Direction.NE);
					after_Eat = false;
				}
				// NEWWWWWWW
			}
		}

		// System.out.println("YESSSS");
		// System.out.println(toEatAll);
		// System.out.println(after_eat_direction);
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

	@Override
	public ArrayList<ArrayList<Integer>> getMoveableCoordinates() {
		return moveableCoordinates;
	}

	@Override
	public ArrayList<ArrayList<ArrayList<Integer>>> getToEatCoordinates() {
		return toEatAll;
	}
}
