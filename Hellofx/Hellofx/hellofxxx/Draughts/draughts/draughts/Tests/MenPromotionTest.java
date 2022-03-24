package draughts.Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.Men;

public class MenPromotionTest {
    @Test
    public void WhitePromotion() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(1, 1, Whmen1);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        board.movePiece(1, 1, 0, 2, board.getPiece(1, 1), toEat);
        String className = board.getPiece(0, 2).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void BlackPromotion() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.BLACK);
        board.setPiece(8, 8, Whmen1);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        board.movePiece(8, 8, 9, 9, board.getPiece(8, 8), toEat);
        String className = board.getPiece(9, 9).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void WhiteNoFalsePromotionAfterEat() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(2, 2, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(1, 3, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(1, 5, Blmen2);

        Whmen1.computeMoveableCoordinates(2, 2, board);
        board.movePiece(2, 2, 2, 6, board.getPiece(2, 2), Whmen1.getToEatCoordinates());
        String className = board.getPiece(2, 6).getClass().getName().toString();

        assertEquals("draughts.Men", className);
    }

    @Test
    public void BlackNoFalsePromotionAfterEat() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(7, 7, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(8, 6, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(8, 4, Whmen2);

        Blmen1.computeMoveableCoordinates(7, 7, board);
        board.movePiece(7, 7, 7, 3, board.getPiece(7, 7), Blmen1.getToEatCoordinates());
        String className = board.getPiece(7, 3).getClass().getName().toString();

        assertEquals("draughts.Men", className);
    }

    @Test
    public void WhitePromotionAfterEat() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(2, 2, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(1, 3, Blmen1);

        Whmen1.computeMoveableCoordinates(2, 2, board);
        board.movePiece(2, 2, 0, 4, board.getPiece(2, 2), Whmen1.getToEatCoordinates());
        String className = board.getPiece(0, 4).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void BlackPromotionAfterEat() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(7, 7, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(8, 6, Whmen1);

        Blmen1.computeMoveableCoordinates(7, 7, board);
        board.movePiece(7, 7, 9, 5, board.getPiece(7, 7), Blmen1.getToEatCoordinates());
        String className = board.getPiece(9, 5).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void WhitePromotionAfterEatCorner1() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(2, 2, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(1, 1, Blmen1);

        Whmen1.computeMoveableCoordinates(2, 2, board);
        board.movePiece(2, 2, 0, 0, board.getPiece(2, 2), Whmen1.getToEatCoordinates());
        String className = board.getPiece(0, 0).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void WhitePromotionAfterEatCorner2() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(2, 7, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(1, 8, Blmen1);

        Whmen1.computeMoveableCoordinates(2, 7, board);
        board.movePiece(2, 7, 0, 9, board.getPiece(2, 7), Whmen1.getToEatCoordinates());
        String className = board.getPiece(0, 9).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void BlackPromotionAfterEatCorner1() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(7, 7, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(8, 8, Whmen1);

        Blmen1.computeMoveableCoordinates(7, 7, board);
        board.movePiece(7, 7, 9, 9, board.getPiece(7, 7), Blmen1.getToEatCoordinates());
        String className = board.getPiece(9, 9).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void BlackPromotionAfterEatCorner2() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(7, 2, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(8, 1, Whmen1);

        Blmen1.computeMoveableCoordinates(7, 2, board);
        board.movePiece(7, 2, 9, 0, board.getPiece(7, 2), Blmen1.getToEatCoordinates());
        String className = board.getPiece(9, 0).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void WhitePromotionAfterEatCornerPenultimate1() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(2, 3, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(1, 2, Blmen1);

        Whmen1.computeMoveableCoordinates(2, 3, board);
        board.movePiece(2, 3, 0, 1, board.getPiece(2, 3), Whmen1.getToEatCoordinates());
        String className = board.getPiece(0, 1).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void WhitePromotionAfterEatCornerPenultimate2() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(2, 6, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(1, 7, Blmen1);

        Whmen1.computeMoveableCoordinates(2, 6, board);
        board.movePiece(2, 6, 0, 8, board.getPiece(2, 6), Whmen1.getToEatCoordinates());
        String className = board.getPiece(0, 8).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void BlackPromotionAfterEatCornerPenultimate1() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(7, 6, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(8, 7, Whmen1);

        Blmen1.computeMoveableCoordinates(7, 6, board);
        board.movePiece(7, 7, 9, 8, board.getPiece(7, 6), Blmen1.getToEatCoordinates());
        String className = board.getPiece(9, 8).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }

    @Test
    public void BlackPromotionAfterEatCornerPenultimate2() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(7, 3, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(8, 2, Whmen1);

        Blmen1.computeMoveableCoordinates(7, 3, board);
        board.movePiece(7, 3, 9, 1, board.getPiece(7, 3), Blmen1.getToEatCoordinates());
        String className = board.getPiece(9, 1).getClass().getName().toString();

        assertEquals("draughts.King", className);
    }
}
