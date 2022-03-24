package draughts.Tests;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import draughts.CheckerBoard;
import draughts.Colour;
import draughts.Draughts;
import draughts.Men;

public class ObjectCreateTest {
    @Test
    public void DraughtsCreateTest() throws Exception {
        Draughts g = new Draughts();

        assertNotEquals(null, g);
    }

    @Test
    public void CheckerboardCreateTest() throws Exception {
        CheckerBoard board = new CheckerBoard();

        assertNotEquals(null, board);
    }

    @Test
    public void WhiteMenCreateTest() throws Exception {
        Men Whmen = new Men(Colour.WHITE);

        assertNotEquals(null, Whmen);
    }

    @Test
    public void BlackMenCreateTest() throws Exception {
        Men Blmen = new Men(Colour.BLACK);

        assertNotEquals(null, Blmen);
    }
}
