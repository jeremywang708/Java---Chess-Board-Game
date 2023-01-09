/*File name: Rook.java
Author: Yun Wang, ID# 041069121
Course: CST8132 – OOP, Lab Section: 302
Lab: 03
Date: 2022-10-09
Professor: Gustavo Adami
Purpose: This class includes methods to get valid moves for rooks, print rook symbol and names.
*/
public class Rook extends Piece {
	
	Rook(boolean chessColor) {
		this.chessColor = chessColor;
	}

	Rook() {}
	
	@Override
	public void getValidMoves(int row, int col) {
		System.out.println("The valid moves are: ");
		if (row == 0) {
			if (col == 0) {
				for (int i = 2; i <= 8; i++) {
					System.out.println((row + 1) + ", " + i + " and " + i + ", " + (col + 1));
				}
			} else if (col == 7) {
				for (int i = 2; i <= 8; i++) {
					System.out.println((row + 1) + ", " + (i-1) + " and " + i + ", " + (col + 1));
				}
			}
		} else if (row == 1) {
			if (col == 0) {
				System.out.println("1, 1");
				System.out.println("3, 1");
				System.out.println("4, 1");
				System.out.println("5, 1");
				System.out.println("6, 1");
				System.out.println("7, 1");
				System.out.println("8, 1");
				
				System.out.println("2, 2");
				System.out.println("2, 3");
				System.out.println("2, 4");
				System.out.println("2, 5");
				System.out.println("2, 6");
				System.out.println("2, 7");
				System.out.println("2, 8");
			} else if (col == 1) {
				System.out.println("1, 2");
				System.out.println("3, 2");
				System.out.println("4, 2");
				System.out.println("5, 2");
				System.out.println("6, 2");
				System.out.println("7, 2");
				System.out.println("8, 2");
				
				System.out.println("2, 1");
				System.out.println("2, 3");
				System.out.println("2, 4");
				System.out.println("2, 5");
				System.out.println("2, 6");
				System.out.println("2, 7");
				System.out.println("2, 8");
			} else if (col == 2) {
				System.out.println("1, 3");
				System.out.println("3, 3");
				System.out.println("4, 3");
				System.out.println("5, 3");
				System.out.println("6, 3");
				System.out.println("7, 3");
				System.out.println("8, 3");
				
				System.out.println("2, 1");
				System.out.println("2, 2");
				System.out.println("2, 4");
				System.out.println("2, 5");
				System.out.println("2, 6");
				System.out.println("2, 7");
				System.out.println("2, 8");
			} else if (col == 3) {
				System.out.println("1, 4");
				System.out.println("3, 4");
				System.out.println("4, 4");
				System.out.println("5, 4");
				System.out.println("6, 4");
				System.out.println("7, 4");
				System.out.println("8, 4");
				
				System.out.println("2, 1");
				System.out.println("2, 2");
				System.out.println("2, 3");
				System.out.println("2, 5");
				System.out.println("2, 6");
				System.out.println("2, 7");
				System.out.println("2, 8");
			} else if (col == 4) {
				System.out.println("1, 5");
				System.out.println("3, 5");
				System.out.println("4, 5");
				System.out.println("5, 5");
				System.out.println("6, 5");
				System.out.println("7, 5");
				System.out.println("8, 5");
				
				System.out.println("2, 1");
				System.out.println("2, 2");
				System.out.println("2, 3");
				System.out.println("2, 4");
				System.out.println("2, 6");
				System.out.println("2, 7");
				System.out.println("2, 8");
			} else if (col == 5) {
				System.out.println("1, 6");
				System.out.println("3, 6");
				System.out.println("4, 6");
				System.out.println("5, 6");
				System.out.println("6, 6");
				System.out.println("7, 6");
				System.out.println("8, 6");
				
				System.out.println("2, 1");
				System.out.println("2, 2");
				System.out.println("2, 3");
				System.out.println("2, 4");
				System.out.println("2, 5");
				System.out.println("2, 7");
				System.out.println("2, 8");
			} else if (col == 6) {
				System.out.println("1, 7");
				System.out.println("3, 7");
				System.out.println("4, 7");
				System.out.println("5, 7");
				System.out.println("6, 7");
				System.out.println("7, 7");
				System.out.println("8, 7");
				
				System.out.println("2, 1");
				System.out.println("2, 2");
				System.out.println("2, 3");
				System.out.println("2, 4");
				System.out.println("2, 5");
				System.out.println("2, 6");
				System.out.println("2, 8");
			} else if (col == 7) {
				System.out.println("1, 8");
				System.out.println("3, 8");
				System.out.println("4, 8");
				System.out.println("5, 8");
				System.out.println("6, 8");
				System.out.println("7, 8");
				System.out.println("8, 8");
				
				System.out.println("2, 1");
				System.out.println("2, 2");
				System.out.println("2, 3");
				System.out.println("2, 4");
				System.out.println("2, 5");
				System.out.println("2, 6");
				System.out.println("2, 7");
			} else {}

		} else if (row == 2) {
			if (col == 0) {
				System.out.println("1, 1");
				System.out.println("2, 1");
				System.out.println("4, 1");
				System.out.println("5, 1");
				System.out.println("6, 1");
				System.out.println("7, 1");
				System.out.println("8, 1");
				
				System.out.println("3, 2");
				System.out.println("3, 3");
				System.out.println("3, 4");
				System.out.println("3, 5");
				System.out.println("3, 6");
				System.out.println("3, 7");
				System.out.println("3, 8");
			} else if (col == 1) {
				System.out.println("1, 2");
				System.out.println("2, 2");
				System.out.println("4, 2");
				System.out.println("5, 2");
				System.out.println("6, 2");
				System.out.println("7, 2");
				System.out.println("8, 2");
				
				System.out.println("3, 1");
				System.out.println("3, 3");
				System.out.println("3, 4");
				System.out.println("3, 5");
				System.out.println("3, 6");
				System.out.println("3, 7");
				System.out.println("3, 8");
			} else if (col == 2) {
				System.out.println("1, 3");
				System.out.println("2, 3");
				System.out.println("4, 3");
				System.out.println("5, 3");
				System.out.println("6, 3");
				System.out.println("7, 3");
				System.out.println("8, 3");
				
				System.out.println("3, 1");
				System.out.println("3, 2");
				System.out.println("3, 4");
				System.out.println("3, 5");
				System.out.println("3, 6");
				System.out.println("3, 7");
				System.out.println("3, 8");
			} else if (col == 3) {
				System.out.println("1, 4");
				System.out.println("2, 4");
				System.out.println("4, 4");
				System.out.println("5, 4");
				System.out.println("6, 4");
				System.out.println("7, 4");
				System.out.println("8, 4");
				
				System.out.println("3, 1");
				System.out.println("3, 2");
				System.out.println("3, 3");
				System.out.println("3, 5");
				System.out.println("3, 6");
				System.out.println("3, 7");
				System.out.println("3, 8");
			} else if (col == 4) {
				System.out.println("1, 5");
				System.out.println("2, 5");
				System.out.println("4, 5");
				System.out.println("5, 5");
				System.out.println("6, 5");
				System.out.println("7, 5");
				System.out.println("8, 5");
				
				System.out.println("3, 1");
				System.out.println("3, 2");
				System.out.println("3, 3");
				System.out.println("3, 4");
				System.out.println("3, 6");
				System.out.println("3, 7");
				System.out.println("3, 8");
			} else if (col == 5) {
				System.out.println("1, 6");
				System.out.println("2, 6");
				System.out.println("4, 6");
				System.out.println("5, 6");
				System.out.println("6, 6");
				System.out.println("7, 6");
				System.out.println("8, 6");
				
				System.out.println("3, 1");
				System.out.println("3, 2");
				System.out.println("3, 3");
				System.out.println("3, 4");
				System.out.println("3, 5");
				System.out.println("3, 7");
				System.out.println("3, 8");
			} else if (col == 6) {
				System.out.println("1, 7");
				System.out.println("2, 7");
				System.out.println("4, 7");
				System.out.println("5, 7");
				System.out.println("6, 7");
				System.out.println("7, 7");
				System.out.println("8, 7");
				
				System.out.println("3, 1");
				System.out.println("3, 2");
				System.out.println("3, 3");
				System.out.println("3, 4");
				System.out.println("3, 5");
				System.out.println("3, 6");
				System.out.println("3, 8");
			} else if (col == 7) {
				System.out.println("1, 8");
				System.out.println("2, 8");
				System.out.println("4, 8");
				System.out.println("5, 8");
				System.out.println("6, 8");
				System.out.println("7, 8");
				System.out.println("8, 8");
				
				System.out.println("3, 1");
				System.out.println("3, 2");
				System.out.println("3, 3");
				System.out.println("3, 4");
				System.out.println("3, 5");
				System.out.println("3, 6");
				System.out.println("3, 7");
			} else {}
		} else if (row == 3) {
			if (col == 0) {
				System.out.println("1, 1");
				System.out.println("2, 1");
				System.out.println("3, 1");
				System.out.println("5, 1");
				System.out.println("6, 1");
				System.out.println("7, 1");
				System.out.println("8, 1");
				
				System.out.println("4, 2");
				System.out.println("4, 3");
				System.out.println("4, 4");
				System.out.println("4, 5");
				System.out.println("4, 6");
				System.out.println("4, 7");
				System.out.println("4, 8");
			} else if (col == 1) {
				System.out.println("1, 2");
				System.out.println("2, 2");
				System.out.println("3, 2");
				System.out.println("5, 2");
				System.out.println("6, 2");
				System.out.println("7, 2");
				System.out.println("8, 2");
				
				System.out.println("4, 1");
				System.out.println("4, 3");
				System.out.println("4, 4");
				System.out.println("4, 5");
				System.out.println("4, 6");
				System.out.println("4, 7");
				System.out.println("4, 8");
			} else if (col == 2) {
				System.out.println("1, 3");
				System.out.println("2, 3");
				System.out.println("3, 3");
				System.out.println("5, 3");
				System.out.println("6, 3");
				System.out.println("7, 3");
				System.out.println("8, 3");
				
				System.out.println("4, 1");
				System.out.println("4, 2");
				System.out.println("4, 4");
				System.out.println("4, 5");
				System.out.println("4, 6");
				System.out.println("4, 7");
				System.out.println("4, 8");
			} else if (col == 3) {
				System.out.println("1, 4");
				System.out.println("2, 4");
				System.out.println("3, 4");
				System.out.println("5, 4");
				System.out.println("6, 4");
				System.out.println("7, 4");
				System.out.println("8, 4");
				
				System.out.println("4, 1");
				System.out.println("4, 2");
				System.out.println("4, 3");
				System.out.println("4, 5");
				System.out.println("4, 6");
				System.out.println("4, 7");
				System.out.println("4, 8");
			} else if (col == 4) {
				System.out.println("1, 5");
				System.out.println("2, 5");
				System.out.println("3, 5");
				System.out.println("5, 5");
				System.out.println("6, 5");
				System.out.println("7, 5");
				System.out.println("8, 5");
				
				System.out.println("4, 1");
				System.out.println("4, 2");
				System.out.println("4, 3");
				System.out.println("4, 4");
				System.out.println("4, 6");
				System.out.println("4, 7");
				System.out.println("4, 8");
			} else if (col == 5) {
				System.out.println("1, 6");
				System.out.println("2, 6");
				System.out.println("3, 6");
				System.out.println("5, 6");
				System.out.println("6, 6");
				System.out.println("7, 6");
				System.out.println("8, 6");
				
				System.out.println("4, 1");
				System.out.println("4, 2");
				System.out.println("4, 3");
				System.out.println("4, 4");
				System.out.println("4, 5");
				System.out.println("4, 7");
				System.out.println("4, 8");
			} else if (col == 6) {
				System.out.println("1, 7");
				System.out.println("2, 7");
				System.out.println("3, 7");
				System.out.println("5, 7");
				System.out.println("6, 7");
				System.out.println("7, 7");
				System.out.println("8, 7");
				
				System.out.println("4, 1");
				System.out.println("4, 2");
				System.out.println("4, 3");
				System.out.println("4, 4");
				System.out.println("4, 5");
				System.out.println("4, 6");
				System.out.println("4, 8");
			} else if (col == 7) {
				System.out.println("1, 8");
				System.out.println("2, 8");
				System.out.println("3, 8");
				System.out.println("5, 8");
				System.out.println("6, 8");
				System.out.println("7, 8");
				System.out.println("8, 8");
				
				System.out.println("4, 1");
				System.out.println("4, 2");
				System.out.println("4, 3");
				System.out.println("4, 4");
				System.out.println("4, 5");
				System.out.println("4, 6");
				System.out.println("4, 7");
			} else {}
		} else if (row == 4) {
			if (col == 0) {
				System.out.println("1, 1");
				System.out.println("2, 1");
				System.out.println("3, 1");
				System.out.println("4, 1");
				System.out.println("6, 1");
				System.out.println("7, 1");
				System.out.println("8, 1");
				
				System.out.println("5, 2");
				System.out.println("5, 3");
				System.out.println("5, 4");
				System.out.println("5, 5");
				System.out.println("5, 6");
				System.out.println("5, 7");
				System.out.println("5, 8");
			} else if (col == 1) {
				System.out.println("1, 2");
				System.out.println("2, 2");
				System.out.println("3, 2");
				System.out.println("4, 2");
				System.out.println("6, 2");
				System.out.println("7, 2");
				System.out.println("8, 2");
				
				System.out.println("5, 1");
				System.out.println("5, 3");
				System.out.println("5, 4");
				System.out.println("5, 5");
				System.out.println("5, 6");
				System.out.println("5, 7");
				System.out.println("5, 8");
			} else if (col == 2) {
				System.out.println("1, 3");
				System.out.println("2, 3");
				System.out.println("3, 3");
				System.out.println("4, 3");
				System.out.println("6, 3");
				System.out.println("7, 3");
				System.out.println("8, 3");
				
				System.out.println("5, 1");
				System.out.println("5, 2");
				System.out.println("5, 4");
				System.out.println("5, 5");
				System.out.println("5, 6");
				System.out.println("5, 7");
				System.out.println("5, 8");
			} else if (col == 3) {
				System.out.println("1, 4");
				System.out.println("2, 4");
				System.out.println("3, 4");
				System.out.println("4, 4");
				System.out.println("6, 4");
				System.out.println("7, 4");
				System.out.println("8, 4");
				
				System.out.println("5, 1");
				System.out.println("5, 2");
				System.out.println("5, 3");
				System.out.println("5, 5");
				System.out.println("5, 6");
				System.out.println("5, 7");
				System.out.println("5, 8");
			} else if (col == 4) {
				System.out.println("1, 5");
				System.out.println("2, 5");
				System.out.println("3, 5");
				System.out.println("4, 5");
				System.out.println("6, 5");
				System.out.println("7, 5");
				System.out.println("8, 5");
				
				System.out.println("5, 1");
				System.out.println("5, 2");
				System.out.println("5, 3");
				System.out.println("5, 4");
				System.out.println("5, 6");
				System.out.println("5, 7");
				System.out.println("5, 8");
			} else if (col == 5) {
				System.out.println("1, 6");
				System.out.println("2, 6");
				System.out.println("3, 6");
				System.out.println("4, 6");
				System.out.println("6, 6");
				System.out.println("7, 6");
				System.out.println("8, 6");
				
				System.out.println("5, 1");
				System.out.println("5, 2");
				System.out.println("5, 3");
				System.out.println("5, 4");
				System.out.println("5, 5");
				System.out.println("5, 7");
				System.out.println("5, 8");
			} else if (col == 6) {
				System.out.println("1, 7");
				System.out.println("2, 7");
				System.out.println("3, 7");
				System.out.println("4, 7");
				System.out.println("6, 7");
				System.out.println("7, 7");
				System.out.println("8, 7");
				
				System.out.println("5, 1");
				System.out.println("5, 2");
				System.out.println("5, 3");
				System.out.println("5, 4");
				System.out.println("5, 5");
				System.out.println("5, 6");
				System.out.println("5, 8");
			} else if (col == 7) {
				System.out.println("1, 8");
				System.out.println("2, 8");
				System.out.println("3, 8");
				System.out.println("4, 8");
				System.out.println("6, 8");
				System.out.println("7, 8");
				System.out.println("8, 8");
				
				System.out.println("5, 1");
				System.out.println("5, 2");
				System.out.println("5, 3");
				System.out.println("5, 4");
				System.out.println("5, 5");
				System.out.println("5, 6");
				System.out.println("5, 7");
			} else {}
		} else if (row == 5) {
			if (col == 0) {
				System.out.println("1, 1");
				System.out.println("2, 1");
				System.out.println("3, 1");
				System.out.println("4, 1");
				System.out.println("5, 1");
				System.out.println("7, 1");
				System.out.println("8, 1");
				
				System.out.println("6, 2");
				System.out.println("6, 3");
				System.out.println("6, 4");
				System.out.println("6, 5");
				System.out.println("6, 6");
				System.out.println("6, 7");
				System.out.println("6, 8");
			} else if (col == 1) {
				System.out.println("1, 2");
				System.out.println("2, 2");
				System.out.println("3, 2");
				System.out.println("4, 2");
				System.out.println("5, 2");
				System.out.println("7, 2");
				System.out.println("8, 2");
				
				System.out.println("6, 1");
				System.out.println("6, 3");
				System.out.println("6, 4");
				System.out.println("6, 5");
				System.out.println("6, 6");
				System.out.println("6, 7");
				System.out.println("6, 8");
			} else if (col == 2) {
				System.out.println("1, 3");
				System.out.println("2, 3");
				System.out.println("3, 3");
				System.out.println("4, 3");
				System.out.println("5, 3");
				System.out.println("7, 3");
				System.out.println("8, 3");
				
				System.out.println("6, 1");
				System.out.println("6, 2");
				System.out.println("6, 4");
				System.out.println("6, 5");
				System.out.println("6, 6");
				System.out.println("6, 7");
				System.out.println("6, 8");
			} else if (col == 3) {
				System.out.println("1, 4");
				System.out.println("2, 4");
				System.out.println("3, 4");
				System.out.println("4, 4");
				System.out.println("5, 4");
				System.out.println("7, 4");
				System.out.println("8, 4");
				
				System.out.println("6, 1");
				System.out.println("6, 2");
				System.out.println("6, 3");
				System.out.println("6, 5");
				System.out.println("6, 6");
				System.out.println("6, 7");
				System.out.println("6, 8");
			} else if (col == 4) {
				System.out.println("1, 5");
				System.out.println("2, 5");
				System.out.println("3, 5");
				System.out.println("4, 5");
				System.out.println("5, 5");
				System.out.println("7, 5");
				System.out.println("8, 5");
				
				System.out.println("6, 1");
				System.out.println("6, 2");
				System.out.println("6, 3");
				System.out.println("6, 4");
				System.out.println("6, 6");
				System.out.println("6, 7");
				System.out.println("6, 8");
			} else if (col == 5) {
				System.out.println("1, 6");
				System.out.println("2, 6");
				System.out.println("3, 6");
				System.out.println("4, 6");
				System.out.println("5, 6");
				System.out.println("7, 6");
				System.out.println("8, 6");
				
				System.out.println("6, 1");
				System.out.println("6, 2");
				System.out.println("6, 3");
				System.out.println("6, 4");
				System.out.println("6, 5");
				System.out.println("6, 7");
				System.out.println("6, 8");
			} else if (col == 6) {
				System.out.println("1, 7");
				System.out.println("2, 7");
				System.out.println("3, 7");
				System.out.println("4, 7");
				System.out.println("5, 7");
				System.out.println("7, 7");
				System.out.println("8, 7");
				
				System.out.println("6, 1");
				System.out.println("6, 2");
				System.out.println("6, 3");
				System.out.println("6, 4");
				System.out.println("6, 5");
				System.out.println("6, 6");
				System.out.println("6, 8");
			} else if (col == 7) {
				System.out.println("1, 8");
				System.out.println("2, 8");
				System.out.println("3, 8");
				System.out.println("4, 8");
				System.out.println("5, 8");
				System.out.println("7, 8");
				System.out.println("8, 8");
				
				System.out.println("6, 1");
				System.out.println("6, 2");
				System.out.println("6, 3");
				System.out.println("6, 4");
				System.out.println("6, 5");
				System.out.println("6, 6");
				System.out.println("6, 7");
			} else {}
		} else if (row == 6) {
			if (col == 0) {
				System.out.println("1, 1");
				System.out.println("2, 1");
				System.out.println("3, 1");
				System.out.println("4, 1");
				System.out.println("5, 1");
				System.out.println("6, 1");
				System.out.println("8, 1");
				
				System.out.println("7, 2");
				System.out.println("7, 3");
				System.out.println("7, 4");
				System.out.println("7, 5");
				System.out.println("7, 6");
				System.out.println("7, 7");
				System.out.println("7, 8");
			} else if (col == 1) {
				System.out.println("1, 2");
				System.out.println("2, 2");
				System.out.println("3, 2");
				System.out.println("4, 2");
				System.out.println("5, 2");
				System.out.println("6, 2");
				System.out.println("8, 2");
				
				System.out.println("7, 1");
				System.out.println("7, 3");
				System.out.println("7, 4");
				System.out.println("7, 5");
				System.out.println("7, 6");
				System.out.println("7, 7");
				System.out.println("7, 8");
			} else if (col == 2) {
				System.out.println("1, 3");
				System.out.println("2, 3");
				System.out.println("3, 3");
				System.out.println("4, 3");
				System.out.println("5, 3");
				System.out.println("6, 3");
				System.out.println("8, 3");
				
				System.out.println("7, 1");
				System.out.println("7, 2");
				System.out.println("7, 4");
				System.out.println("7, 5");
				System.out.println("7, 6");
				System.out.println("7, 7");
				System.out.println("7, 8");
			} else if (col == 3) {
				System.out.println("1, 4");
				System.out.println("2, 4");
				System.out.println("3, 4");
				System.out.println("4, 4");
				System.out.println("5, 4");
				System.out.println("6, 4");
				System.out.println("8, 4");
				
				System.out.println("7, 1");
				System.out.println("7, 2");
				System.out.println("7, 3");
				System.out.println("7, 5");
				System.out.println("7, 6");
				System.out.println("7, 7");
				System.out.println("7, 8");
			} else if (col == 4) {
				System.out.println("1, 5");
				System.out.println("2, 5");
				System.out.println("3, 5");
				System.out.println("4, 5");
				System.out.println("5, 5");
				System.out.println("6, 5");
				System.out.println("8, 5");
				
				System.out.println("7, 1");
				System.out.println("7, 2");
				System.out.println("7, 3");
				System.out.println("7, 4");
				System.out.println("7, 6");
				System.out.println("7, 7");
				System.out.println("7, 8");
			} else if (col == 5) {
				System.out.println("1, 6");
				System.out.println("2, 6");
				System.out.println("3, 6");
				System.out.println("4, 6");
				System.out.println("5, 6");
				System.out.println("6, 6");
				System.out.println("8, 6");
				
				System.out.println("7, 1");
				System.out.println("7, 2");
				System.out.println("7, 3");
				System.out.println("7, 4");
				System.out.println("7, 5");
				System.out.println("7, 7");
				System.out.println("7, 8");
			} else if (col == 6) {
				System.out.println("1, 7");
				System.out.println("2, 7");
				System.out.println("3, 7");
				System.out.println("4, 7");
				System.out.println("5, 7");
				System.out.println("6, 7");
				System.out.println("8, 7");
				
				System.out.println("7, 1");
				System.out.println("7, 2");
				System.out.println("7, 3");
				System.out.println("7, 4");
				System.out.println("7, 5");
				System.out.println("7, 6");
				System.out.println("7, 8");
			} else if (col == 7) {
				System.out.println("1, 8");
				System.out.println("2, 8");
				System.out.println("3, 8");
				System.out.println("4, 8");
				System.out.println("5, 8");
				System.out.println("6, 8");
				System.out.println("8, 8");
				
				System.out.println("7, 1");
				System.out.println("7, 2");
				System.out.println("7, 3");
				System.out.println("7, 4");
				System.out.println("7, 5");
				System.out.println("7, 6");
				System.out.println("7, 7");
			} else {}
		} else if (row == 7) {
			if (col == 0) {
				for (int i = 2; i <= 8; i++) {
					System.out.println((row + 1) + ", " + i + " and " + (i-1) + ", " + (col + 1));
				}
			} else if (col == 7) {
				for (int i = 2; i <= 8; i++) {
					System.out.println((row + 1) + ", " + (i-1) + " and " + (i-1) + ", " + (col + 1));
				}
			}
		}
	}

	@Override
	public String getSymbol() {
		String chess = null;

		if (chessColor == true) {
			chess = "R";
		} else if (chessColor == false) {
			chess = "r";
		}
		return chess;
	}

	@Override
	public String getName() {
		String chessName = null;

		if (chessColor == true) {
			chessName = "black Rook";
		} else if (chessColor == false) {
			chessName = "white Rook";
		}
		return chessName;
	}

}
