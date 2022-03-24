package draughts;

import java.io.Serializable;

public class CheckInput implements Serializable {
	// public static void main(String args[]){
	// boolean a=checkCoordinateValidity("1a");
	// System.out.println(a);
	// }

	public boolean checkCoordinateValidity(String input) throws Exception {
		int rowNo = -1;
		int columnNo = -1;
		// System.out.println("CheckInput");
		if (input.equals("Save")) {
			// GUI gui = new GUI();
			Runner run = new Runner();
			// gui.getGame().b.printBoard();
			new Save(run.getGame());
		}
		if (input.isEmpty() || input == null) {
			return false;
		}
		if (input.length() == 2) {
			rowNo = Character.getNumericValue(input.charAt(0));
			columnNo = input.charAt(1);
		}

		else if (input.length() == 3) {
			rowNo = Integer.parseInt(input.substring(0, 2));
			columnNo = input.charAt(2);
		}
		if (rowNo >= 1 && rowNo <= 10) {
			if (columnNo >= 'a' && 'j' >= columnNo) {
				int[] ck1 = new int[2];
				ck1 = extractInputs(input);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public int[] extractInputs(String input) {
		int[] intArray = new int[2];
		int rowNo1 = -1;
		int columnChar = -1;
		if (input.length() == 2) {
			rowNo1 = Character.getNumericValue(input.charAt(0));
			rowNo1 = rowNo1 - 1;
			columnChar = input.charAt(1);
		} else if (input.length() == 3) {
			rowNo1 = Integer.parseInt(input.substring(0, 2));
			rowNo1 = rowNo1 - 1;
			columnChar = input.charAt(2);
		}

		int columnNo = (int) columnChar;
		intArray[0] = rowNo1;
		// System.out.println(intArray[0]);
		// System.out.println(columnNo);
		// a == 0
		// b == 1
		intArray[1] = columnNo - 97;
		// System.out.println(intArray[0]);
		// System.out.println(intArray[1]);
		return intArray;
	}

}
