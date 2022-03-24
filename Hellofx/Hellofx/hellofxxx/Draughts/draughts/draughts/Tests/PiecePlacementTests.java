package draughts.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.King;
import draughts.Men;

public class PiecePlacementTests {

    @Test
    public void WhiteMenCreateTest() throws Exception {
        CheckerBoard board = new CheckerBoard();
        Men Whmen = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen);
        assertTrue(board.hasPiece(5, 5));
    }

    @Test
    public void BlackMenCreateTest() throws Exception {
        CheckerBoard board = new CheckerBoard();
        Men Blmen = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen);
        assertTrue(board.hasPiece(5, 5));
    }

    @Test
    public void WhiteKingCreateTest() throws Exception {
        CheckerBoard board = new CheckerBoard();
        King Whking = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking);
        assertTrue(board.hasPiece(5, 5));
    }

    @Test
    public void BlackKingCreateTest() throws Exception {
        CheckerBoard board = new CheckerBoard();
        King Blking = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking);
        assertTrue(board.hasPiece(5, 5));
    }

    @Test
    public void WhiteMenRemoveTest() throws Exception {
        CheckerBoard board = new CheckerBoard();
        Men Whmen = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen);
        board.getBoard()[5][5].removePiece();
        assertFalse(board.hasPiece(5, 5));
    }

    @Test
    public void BlackMenRemoveTest() throws Exception {
        CheckerBoard board = new CheckerBoard();
        Men Blmen = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen);
        board.getBoard()[5][5].removePiece();
        assertFalse(board.hasPiece(5, 5));
    }

    @Test
    public void WhiteKingRemoveTest() throws Exception {
        CheckerBoard board = new CheckerBoard();
        King Whking = new King(Colour.WHITE);
        board.setPiece(5, 5, Whking);
        board.getBoard()[5][5].removePiece();
        assertFalse(board.hasPiece(5, 5));
    }

    @Test
    public void BlackKingRemoveTest() throws Exception {
        CheckerBoard board = new CheckerBoard();
        King Blking = new King(Colour.BLACK);
        board.setPiece(5, 5, Blking);
        board.getBoard()[5][5].removePiece();
        assertFalse(board.hasPiece(5, 5));
    }

    @Test
    public void WhiteMenMoveTest() throws Exception {
        Boolean doubleCheck = false;
        CheckerBoard board = new CheckerBoard();
        Men Whmen = new Men(Colour.WHITE);
        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();

        board.setPiece(5, 5, Whmen);
        board.movePiece(5, 5, 4, 4, Whmen, toEat);

        if (!board.hasPiece(5, 5) && board.hasPiece(4, 4)) {
            doubleCheck = true;
        }
        assertTrue(doubleCheck);
    }

    @Test
    public void BlackMenMoveTest() throws Exception {
        Boolean doubleCheck = false;
        CheckerBoard board = new CheckerBoard();
        Men Blmen = new Men(Colour.BLACK);
        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();

        board.setPiece(5, 5, Blmen);
        board.movePiece(5, 5, 6, 6, Blmen, toEat);

        if (!board.hasPiece(5, 5) && board.hasPiece(6, 6)) {
            doubleCheck = true;
        }
        assertTrue(doubleCheck);
    }

    @Test
    public void WhitKingMoveTest() throws Exception {
        Boolean doubleCheck = false;
        CheckerBoard board = new CheckerBoard();
        King Whking = new King(Colour.WHITE);
        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();

        board.setPiece(5, 5, Whking);
        board.movePiece(5, 5, 4, 4, Whking, toEat);

        if (!board.hasPiece(5, 5) && board.hasPiece(4, 4)) {
            doubleCheck = true;
        }
        assertTrue(doubleCheck);
    }

    @Test
    public void BlackKingMoveTest() throws Exception {
        Boolean doubleCheck = false;
        CheckerBoard board = new CheckerBoard();
        King Blking = new King(Colour.BLACK);
        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();

        board.setPiece(5, 5, Blking);
        board.movePiece(5, 5, 6, 6, Blking, toEat);

        if (!board.hasPiece(5, 5) && board.hasPiece(6, 6)) {
            doubleCheck = true;
        }
        assertTrue(doubleCheck);
    }
}
