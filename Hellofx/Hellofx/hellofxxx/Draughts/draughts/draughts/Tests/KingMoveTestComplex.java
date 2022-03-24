package draughts.Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.King;

public class KingMoveTestComplex {
    @Test
    public void White_twoPieceCaptureComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(4, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 5, Blking2);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_twoPieceCaptureComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 6, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(8, 6, Blking2);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_twoPieceCaptureComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(5, 1, Blking2);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_twoPieceCaptureComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(3, 7, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 7, Blking2);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_twoPieceCaptureComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(4, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(1, 5, Whking2);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_twoPieceCaptureComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 6, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(8, 6, Whking2);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_twoPieceCaptureComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(5, 1, Whking2);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_twoPieceCaptureComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(3, 7, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(1, 7, Whking2);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_threePieceCaptureComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(4, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 5, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 6, Blking3);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_threePieceCaptureComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 6, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(8, 6, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 6, Blking3);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_threePieceCaptureComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(5, 1, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 6, Blking3);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_threePieceCaptureComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(3, 7, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 7, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking3);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_threePieceCaptureComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(4, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(1, 5, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(4, 6, Whking3);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_threePieceCaptureComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 6, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(8, 6, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(4, 6, Whking3);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_threePieceCaptureComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(5, 1, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(4, 6, Whking3);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_threePieceCaptureComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(3, 7, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(1, 7, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking3);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_fourPieceCaptureComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(4, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 5, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 6, Blking3);

        King Blking4 = new King(Colour.BLACK);
        board.setPiece(4, 8, Blking4);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_fourPieceCaptureComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 6, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(8, 6, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 6, Blking3);

        King Blking4 = new King(Colour.BLACK);
        board.setPiece(4, 8, Blking4);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_fourPieceCaptureComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(5, 1, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 6, Blking3);

        King Blking4 = new King(Colour.BLACK);
        board.setPiece(4, 8, Blking4);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_fourPieceCaptureComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(3, 7, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(1, 7, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(6, 4, Blking3);

        King Blking4 = new King(Colour.BLACK);
        board.setPiece(8, 4, Blking4);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_fourPieceCaptureComplex1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(4, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(1, 5, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(4, 6, Whking3);

        King Whking4 = new King(Colour.WHITE);
        board.setPiece(4, 8, Whking4);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_fourPieceCaptureComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 6, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(8, 6, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(4, 6, Whking3);

        King Whking4 = new King(Colour.WHITE);
        board.setPiece(4, 8, Whking4);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_fourPieceCaptureComplex3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(5, 1, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(4, 6, Whking3);

        King Whking4 = new King(Colour.WHITE);
        board.setPiece(4, 8, Whking4);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_fourPieceCaptureComplex4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(0);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(3, 7, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(1, 7, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(6, 4, Whking3);

        King Whking4 = new King(Colour.WHITE);
        board.setPiece(8, 4, Whking4);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }
}
