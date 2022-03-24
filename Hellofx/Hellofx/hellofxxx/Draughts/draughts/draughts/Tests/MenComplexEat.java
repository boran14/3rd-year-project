package draughts.Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.Men;

public class MenComplexEat {

    @Test
    public void WhiteTripleEat() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(2, 4, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(2, 2, Blmen3);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> coordinates;
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
        point.add(1);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
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

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        Whmen1.computeMoveableCoordinates(5, 5, board);

        assertEquals(toEat, Whmen1.getToEatCoordinates());
    }

    @Test
    public void WhiteTripleEat2() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(5, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 6, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(2, 8, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(2, 6, Blmen3);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> coordinates;
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
        point.add(1);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        Whmen1.computeMoveableCoordinates(5, 5, board);

        assertEquals(toEat, Whmen1.getToEatCoordinates());
    }

    @Test
    public void WhiteTripleEat3() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(3, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 6, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(6, 8, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(6, 6, Blmen3);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> coordinates;
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        Whmen1.computeMoveableCoordinates(3, 5, board);

        assertEquals(toEat, Whmen1.getToEatCoordinates());
    }

    @Test
    public void WhiteTripleEat4() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(3, 5, Whmen1);

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(4, 4, Blmen1);

        Men Blmen2 = new Men(Colour.BLACK);
        board.setPiece(6, 2, Blmen2);

        Men Blmen3 = new Men(Colour.BLACK);
        board.setPiece(4, 2, Blmen3);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> coordinates;
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        Whmen1.computeMoveableCoordinates(3, 5, board);

        assertEquals(toEat, Whmen1.getToEatCoordinates());
    }

    @Test
    public void BlackTripleEat() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(4, 4, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(2, 4, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(2, 2, Whmen3);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> coordinates;
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
        point.add(1);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
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

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        Blmen1.computeMoveableCoordinates(5, 5, board);

        assertEquals(toEat, Blmen1.getToEatCoordinates());
    }

    @Test
    public void BlackTripleEat2() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(5, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(4, 6, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(2, 8, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(2, 6, Whmen3);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> coordinates;
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
        point.add(1);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(1);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(2);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        Blmen1.computeMoveableCoordinates(5, 5, board);

        assertEquals(toEat, Blmen1.getToEatCoordinates());
    }

    @Test
    public void BlackTripleEat3() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(3, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(4, 6, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(6, 8, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(6, 6, Whmen3);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> coordinates;
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(7);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(9);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(8);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(5);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(6);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(6);
        coordinates.add(point);

        toEat.add(coordinates);

        Blmen1.computeMoveableCoordinates(3, 5, board);

        assertEquals(toEat, Blmen1.getToEatCoordinates());
    }

    @Test
    public void BlackTripleEat4() throws Exception {
        CheckerBoard board = new CheckerBoard();

        Men Blmen1 = new Men(Colour.BLACK);
        board.setPiece(3, 5, Blmen1);

        Men Whmen1 = new Men(Colour.WHITE);
        board.setPiece(4, 4, Whmen1);

        Men Whmen2 = new Men(Colour.WHITE);
        board.setPiece(6, 2, Whmen2);

        Men Whmen3 = new Men(Colour.WHITE);
        board.setPiece(4, 2, Whmen3);

        ArrayList<ArrayList<ArrayList<Integer>>> toEat = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> coordinates;
        ArrayList<Integer> point;

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(5);
        point.add(3);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(7);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(6);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        coordinates = new ArrayList<ArrayList<Integer>>();
        point = new ArrayList<Integer>();
        point.add(3);
        point.add(1);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(4);
        coordinates.add(point);

        point = new ArrayList<Integer>();
        point.add(4);
        point.add(2);
        coordinates.add(point);

        toEat.add(coordinates);

        Blmen1.computeMoveableCoordinates(3, 5, board);

        assertEquals(toEat, Blmen1.getToEatCoordinates());
    }

}
