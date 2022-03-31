package draughts;

import java.io.Serializable;

public class CheckInput implements Serializable {

	public boolean coordinateChecker(String point) throws Exception {
		int rowNumber = -1;
		int columnNumber = -1;
		// System.out.println("CheckInput");
		if (point.equals("Save")) {
			// GUI gui = new GUI();
			Runner run = new Runner();
			// gui.getGame().b.printBoard();
			new Save(run.getGame());
		}
		if (point.isEmpty() || point == null) {
			return false;
		}
		if (point.length() == 2) {
			rowNumber = Character.getNumericValue(point.charAt(0));
			columnNumber = point.charAt(1);
		}

		else if (point.length() == 3) {
			rowNumber = Integer.parseInt(point.substring(0, 2));
			columnNumber = point.charAt(2);
		}
		if (rowNumber >= 1 && rowNumber <= 10) {
			if (columnNumber >= 'a' && 'j' >= columnNumber) {
				int[] coord = new int[2];
				coord = preparePointCoordinates(point);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public int[] preparePointCoordinates(String point) {
		int[] cd = new int[2];
		int row = -1;
		int column = -1;
		if (point.length() == 2) {
			row = Character.getNumericValue(point.charAt(0));
			row = row - 1;
			column = point.charAt(1);
		} else if (point.length() == 3) {
			row = Integer.parseInt(point.substring(0, 2));
			row = row - 1;
			column = point.charAt(2);
		}

		int columnNumber = (int) column;
		cd[0] = row;
		cd[1] = columnNumber - 97;
		return cd;
	}

}
