package draughts.Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.King;

public class KingMoveTest {
    @Test
    public void White_zeroPieceCapture() throws Exception {
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

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_zeroPieceCapture() throws Exception {
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

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_CornerNoCapture1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(5);
        coordinates.add(tmp);

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

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(0, 0, Whking1);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(0, 0, board));
    }

    @Test
    public void White_CornerNoCapture2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(0);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(0, 9, Whking1);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(0, 9, board));
    }

    @Test
    public void White_CornerNoCapture3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(9, 0, Whking1);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(9, 0, board));
    }

    @Test
    public void White_CornerNoCapture4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(5);
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

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(9, 9, Whking1);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(9, 9, board));
    }

    @Test
    public void Black_CornerNoCapture1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(5);
        coordinates.add(tmp);

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

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(0, 0, Blking1);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(0, 0, board));
    }

    @Test
    public void Black_CornerNoCapture2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(0);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(0, 9, Blking1);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(0, 9, board));
    }

    @Test
    public void Black_CornerNoCapture3() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(9, 0, Blking1);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(9, 0, board));
    }

    @Test
    public void Black_CornerNoCapture4() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(5);
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

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(9, 9, Blking1);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(9, 9, board));
    }

    @Test
    public void White_LeftSideNoCapture1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(4);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 0, Whking1);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 0, board));
    }

    @Test
    public void Black_LeftSideNoCapture1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(4);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 0, Blking1);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 0, board));
    }

    @Test
    public void White_RightSideNoCapture1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 9, Whking1);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 9, board));
    }

    @Test
    public void Black_RightSideNoCapture1() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 9, Blking1);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 9, board));
    }

    @Test
    public void White_onePieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
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
        board.setPiece(7, 7, Blking1);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_onePieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
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
        board.setPiece(7, 7, Whking1);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_twoPieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
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
        board.setPiece(7, 7, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(8, 2, Blking2);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_twoPieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
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
        board.setPiece(7, 7, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(8, 2, Whking2);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_threePieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
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
        tmp.add(9);
        tmp.add(1);
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
        board.setPiece(7, 7, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(8, 2, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 4, Blking3);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_threePieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
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
        tmp.add(9);
        tmp.add(1);
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
        board.setPiece(7, 7, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(8, 2, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(4, 4, Whking3);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_fourPieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
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
        tmp.add(9);
        tmp.add(1);
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
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking1);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(7, 7, Blking1);

        King Blking2 = new King(Colour.BLACK);
        board.setPiece(8, 2, Blking2);

        King Blking3 = new King(Colour.BLACK);
        board.setPiece(4, 4, Blking3);

        King Blking4 = new King(Colour.BLACK);
        board.setPiece(3, 7, Blking4);

        assertEquals(coordinates, Whking1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_fourPieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(6);
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
        tmp.add(9);
        tmp.add(1);
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
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        King Blking1 = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking1);

        King Whking1 = new King(Colour.WHITE);
        board.setPiece(7, 7, Whking1);

        King Whking2 = new King(Colour.WHITE);
        board.setPiece(8, 2, Whking2);

        King Whking3 = new King(Colour.WHITE);
        board.setPiece(4, 4, Whking3);

        King Whking4 = new King(Colour.WHITE);
        board.setPiece(3, 7, Whking4);

        assertEquals(coordinates, Blking1.computeMoveableCoordinates(5, 5, board));
    }
}
