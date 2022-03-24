package draughts.Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.King;

public class KingEatTest {
    @Test
    public void White_PieceEatComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(1);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(7, 7, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 5, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(5, 1, Blking3);

        Whking1.computeMoveableCoordinates(7, 7, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void White_PieceEatComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(8);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(4);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(1, 8, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(2, 7, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 4, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 7, Blking3);

        Whking1.computeMoveableCoordinates(1, 8, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void Black_PieceEatComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(1);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(5);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(7, 7, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(1, 5, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(5, 1, Whking3);

        Blking1.computeMoveableCoordinates(7, 7, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void Black_PieceEatComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(8);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(4);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.WHITE);
        board.setPiece(1, 8, Blking1);

        King Whking1 = new King(Colour.BLACK);
        board.setPiece(2, 7, Whking1);

        King Whking2 = new King(Colour.BLACK);
        board.setPiece(1, 4, Whking2);

        King Whking3 = new King(Colour.BLACK);
        board.setPiece(4, 7, Whking3);

        Blking1.computeMoveableCoordinates(1, 8, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void White_PieceEatComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(3);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(3);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(3);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(3);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(4);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(8);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(9, 0, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 3, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(2, 7, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(3, 2, Blking3);

        King Blking4 = new King(Colour.BLACK);
        board.setPiece(1, 2, Blking4);

        King Blking5 = new King(Colour.BLACK);
        board.setPiece(5, 8, Blking5);

        Whking1.computeMoveableCoordinates(9, 0, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void Black_PieceEatComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(3);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(3);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(3);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(3);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(4);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(6);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(5);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(8);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(7);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(9, 0, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 3, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(2, 7, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(3, 2, Whking3);

        King Whking4 = new King(Colour.WHITE);
        board.setPiece(1, 2, Whking4);

        King Whking5 = new King(Colour.WHITE);
        board.setPiece(5, 8, Whking5);

        Blking1.computeMoveableCoordinates(9, 0, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }
}
