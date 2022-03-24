package draughts.Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.King;

public class KingEatTestComplex {
    @Test
    public void White_onePieceEatComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(4, 4, Blking1);

        Whking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void White_onePieceEatComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(8);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(4, 6, Blking1);

        Whking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void White_onePieceEatComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(8);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 6, Blking1);

        Whking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void White_onePieceEatComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking1);

        Whking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void Black_onePieceEatComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(4, 4, Whking1);

        Blking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void Black_onePieceEatComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(8);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(4, 6, Whking1);

        Blking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void Black_onePieceEatComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(8);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 6, Whking1);

        Blking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void Black_onePieceEatComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking1);

        Blking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void White_twoPieceEatComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(4, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(2, 8, Blking2);

        Whking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void White_twoPieceEatComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(2, 8, Blking2);

        Whking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void White_twoPieceEatComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(8);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(8, 8, Blking2);

        Whking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void White_twoPieceEatComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(1);
        coordinates.add(point);

        toEat.add(coordinates);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 1, Blking2);

        Whking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Whking1.getToEatCoordinates());
    }

    @Test
    public void Black_twoPieceEatComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(2);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(4, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(2, 8, Whking2);

        Blking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void Black_twoPieceEatComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(2, 8, Whking2);

        Blking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void Black_twoPieceEatComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(8);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(8, 8, Whking2);

        Blking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }

    @Test
    public void Black_twoPieceEatComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates;

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(8);
        point.add(2);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(9);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(0);
        point.add(0);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(1);
        point.add(1);
        coordinates.add(point);

        toEat.add(coordinates);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(1, 1, Whking2);

        Blking1.computeMoveableCoordinates(5, 5, board);
        assertEquals(toEat, Blking1.getToEatCoordinates());
    }
}
