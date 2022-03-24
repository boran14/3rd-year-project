package draughts;

import java.io.Serializable;
import java.util.*;

public abstract class Piece implements Serializable {
  private String symbol;
  protected Colour colour;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Colour getColour() {
    return colour;
  }

  public abstract boolean check(int i, int j, int k, int l, CheckerBoard board11);

  public abstract ArrayList<ArrayList<Integer>> computeMoveableCoordinates(int i, int j, CheckerBoard board11);

  public abstract ArrayList<ArrayList<Integer>> getMoveableCoordinates();

  public abstract ArrayList<ArrayList<ArrayList<Integer>>> getToEatCoordinates();

  public abstract ArrayList<ArrayList<Integer>> getEatableCoordinates(
      ArrayList<ArrayList<ArrayList<Integer>>> toEatAllMark,
      int i1, int j1);
}
