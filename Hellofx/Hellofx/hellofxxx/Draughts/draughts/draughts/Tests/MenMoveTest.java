package draughts.Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.Men;

/**
 * MyTest
 */
public class MenMoveTest {
    @Test
    public void MyTest1() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void failTest() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void White_onePieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_twoPieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(4, 6, Blmen2);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_threePieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(4, 6, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(6, 6, Blmen3);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_fourPieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(4, 6, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(6, 6, Blmen3);

        Men Blmen4 = new Men(Colour.BLACK);
        board.setPiece(6, 4, Blmen4);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(5, 5, board));
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
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(5, 5, board));
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
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(4, 4, Whmen1);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_twoPieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(6, 6, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(6, 4, Whmen2);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_threePieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(4, 4, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(6, 6, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(6, 4, Whmen3);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_fourPieceCapture() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(4, 4, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(4, 6, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(6, 6, Whmen3);

        Men Whmen4 = new Men(Colour.WHITE);
        board.setPiece(6, 4, Whmen4);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_twoPieceCaptureComplex() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(5);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(2, 4, Blmen2);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_twoPieceCaptureComplex2() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(5);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(2, 4, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(4, 6, Blmen3);

        Men Blmen4 = new Men(Colour.BLACK);
        board.setPiece(2, 8, Blmen4);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void White_twoPieceCaptureComplexReversed() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(2);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(3, 3, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(4, 6, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(4, 2, Blmen3);

        Men Blmen4 = new Men(Colour.BLACK);
        board.setPiece(6, 2, Blmen4);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(3, 3, board));
    }

    @Test
    public void Black_twoPieceCaptureComplex() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(6, 6, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(8, 6, Whmen2);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(5, 5, board));
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
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(1);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(6, 6, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(8, 6, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(6, 4, Whmen3);

        Men Whmen4 = new Men(Colour.WHITE);
        board.setPiece(8, 2, Whmen4);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(5, 5, board));
    }

    @Test
    public void Black_twoPieceCaptureComplexReversed() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(9);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(7);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(7, 7, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(6, 6, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(6, 8, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(4, 8, Whmen3);

        Men Whmen4 = new Men(Colour.WHITE);
        board.setPiece(6, 4, Whmen4);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(7, 7, board));
    }

    @Test
    public void White_threePieceCaptureComplex() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(6);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(7, 7, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(6, 6, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(6, 4, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(8, 4, Blmen3);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(7, 7, board));
    }

    @Test
    public void White_threePieceCaptureComplexReversed() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(4);
        coordinates.add(tmp);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(2, 2, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(3, 3, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(3, 5, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(1, 5, Blmen3);

        assertEquals(coordinates, Whmen1.computeMoveableCoordinates(2, 2, board));
    }

    @Test
    public void Black_threePieceCaptureComplex() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(8);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(8);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(5);
        tmp.add(5);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(7);
        tmp.add(3);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(9);
        tmp.add(5);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(7, 7, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(6, 6, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(6, 4, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(8, 4, Whmen3);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(7, 7, board));
    }

    @Test
    public void Black_threePieceCaptureComplexReversed() throws Exception {
        CheckerBoard board = new CheckerBoard();
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp;

        tmp = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(1);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(4);
        tmp.add(4);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(2);
        tmp.add(6);
        coordinates.add(tmp);

        tmp = new ArrayList<Integer>();
        tmp.add(0);
        tmp.add(4);
        coordinates.add(tmp);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(2, 2, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(3, 3, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(3, 5, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(1, 5, Whmen3);

        assertEquals(coordinates, Blmen1.computeMoveableCoordinates(2, 2, board));
    }
}