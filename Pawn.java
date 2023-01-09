/*File name: Pawn.java
Author: Yun Wang, ID# 041069121
Course: CST8132 – OOP, Lab Section: 302
Lab: 03
Date: 2022-10-09
Professor: Gustavo Adami
Purpose: This class includes methods to get valid moves for pawns, print pawn symbol and names.
*/
public class Pawn extends Piece {

	Pawn(boolean chessColor) {
		this.chessColor = chessColor;
	}

	Pawn() {
	}

	@Override
	public void getValidMoves(int row, int col) {
		System.out.println("The valid moves are: ");
		if (chessColor == false) {
			if (row == 1) {
				System.out.println((row + 2) + ", " + (col + 1));
				System.out.println((row + 3) + ", " + (col + 1));
			} else if (row == 2) {
				System.out.println((row + 2) + ", " + (col + 1));
			} else if (row == 3) {
				System.out.println((row + 2) + ", " + (col + 1));
			} else if (row == 4) {
				System.out.println((row + 2) + ", " + (col + 1));
			} else if (row == 5) {
				System.out.println((row + 2) + ", " + (col + 1));
			} else if (row == 6) {
				System.out.println((row + 2) + ", " + (col + 1));
			}
		} else if (chessColor == true) {
			if (row == 6) {
				System.out.println(row + ", " + (col + 1));
				System.out.println((row - 1) + ", " + (col + 1));
			} else if (row == 5) {
				System.out.println(row + ", " + (col + 1));
			} else if (row == 4) {
				System.out.println(row + ", " + (col + 1));
			} else if (row == 3) {
				System.out.println(row + ", " + (col + 1));
			} else if (row == 2) {
				System.out.println(row + ", " + (col + 1));
			} else if (row == 1) {
				System.out.println(row + ", " + (col + 1));
			}
		}
	}

	@Override
	public String getSymbol() {
		String chess = null;

		if (chessColor == true) {
			chess = "P";
		} else if (chessColor == false) {
			chess = "p";
		}
		return chess;
	}

	@Override
	public String getName() {
		String chessName = null;
		
		if (chessColor == true) {
			chessName = "black Pawn";
		} else if (chessColor == false) {
			chessName = "white Pawn";
		}
		return chessName;
	}

}
