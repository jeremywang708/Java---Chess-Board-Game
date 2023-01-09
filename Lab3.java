
/*File name: Lab3.java
Author: Yun Wang, ID# 041069121
Course: CST8132 – OOP, Lab Section: 302
Lab: 03
Date: 2022-10-09
Professor: Gustavo Adami
Purpose: This class includes methods to initialize 2D array, print chess board
         check piece moves and move pieces.
*/
import java.util.Scanner;

public class Lab3 {
	// It is convenient for each class to call.
	static int row;
	static int col;

	// main method.
	public static void main(String[] args) {
		Lab3 thisLab = new Lab3();

		thisLab.iniChessBoard();
		thisLab.drawBoard();
		thisLab.getMenu();
	}

	// 8*8 2-dimensional array
	static Piece[][] chessBoard = new Piece[8][8];
	// scanner for inputting
	Scanner keyboard = new Scanner(System.in);
	// String array.
	static String[][] helpArray = new String[8][8];

	// this method is used to draw the chess board.
	protected void drawBoard() {
		// print the number of rows.
		for (int row = 0; row < helpArray.length; row++) {
			// print number 1 to 8 on top of chess board.
			if (row == 0) {
				for (int col = 1; col < helpArray[row].length; col++) {
					if (col == 1) {
						System.out.print("     " + col);
					}
					System.out.print("     " + (col + 1));
				}
				System.out.println();
			}
			// print the 1st layer of the chess board.
			printSegment(helpArray, row, "+-----", "+", "  +-----");
			// print the 2nd layer of the chess board.
			printSegment(helpArray, row, "|     ", "|", "  |     ");
			// print the 3rd layer of the chess board.
			for (int col = 0; col < helpArray[row].length; col++) {
				if (col == 0) {
					System.out.print((row + 1) + " ");
				}
				System.out.print("|  " + helpArray[row][col] + "  ");

				if (col == 7) {
					System.out.println("| " + (row + 1));
				}
			}
			// print the 4th layer of the chess board.
			printSegment(helpArray, row, "|     ", "|", "  |     ");

			// The for loop for the 4th layer of the chess board.
			if (row == 7) {
				printSegment(helpArray, row, "+-----", "+", "  +-----");
				// and print 1 2 3...8 on the bottom of chessboard.
				for (int col = 1; col < helpArray[row].length; col++) {
					if (col == 1) {
						System.out.print("     " + col);
					}
					System.out.print("     " + (col + 1));
				}
				System.out.println();
			}
		}
	}

	// this method is used to initialize the chess board.
	protected void iniChessBoard() {
		for (int row = 0; row < helpArray.length; row++) {

			if (row == 0) {

				chessBoard[row][0] = new Rook(false);
				helpArray[row][0] = chessBoard[row][0].getSymbol();

				chessBoard[row][1] = new Knight(false);
				helpArray[row][1] = chessBoard[row][1].getSymbol();

				chessBoard[row][2] = new Bishop(false);
				helpArray[row][2] = chessBoard[row][2].getSymbol();

				chessBoard[row][3] = new King(false);
				helpArray[row][3] = chessBoard[row][3].getSymbol();

				chessBoard[row][4] = new Queen(false);
				helpArray[row][4] = chessBoard[row][4].getSymbol();

				chessBoard[row][5] = new Bishop(false);
				helpArray[row][5] = chessBoard[row][5].getSymbol();

				chessBoard[row][6] = new Knight(false);
				helpArray[row][6] = chessBoard[row][6].getSymbol();

				chessBoard[row][7] = new Rook(false);
				helpArray[row][7] = chessBoard[row][7].getSymbol();

			} else if (row == 1 || row == 6) {
				for (int j = 0; j < 8; j++) {

					if (row == 1) {

						chessBoard[row][j] = new Pawn(false);
						helpArray[row][j] = chessBoard[row][j].getSymbol();

					} else if (row == 6) {

						chessBoard[row][j] = new Pawn(true);
						helpArray[row][j] = chessBoard[row][j].getSymbol();

					}

				}
			} else if (row == 7) {

				chessBoard[row][0] = new Rook(true);
				helpArray[row][0] = chessBoard[row][0].getSymbol();

				chessBoard[row][1] = new Knight(true);
				helpArray[row][1] = chessBoard[row][1].getSymbol();

				chessBoard[row][2] = new Bishop(true);
				helpArray[row][2] = chessBoard[row][2].getSymbol();

				chessBoard[row][3] = new King(true);
				helpArray[row][3] = chessBoard[row][3].getSymbol();

				chessBoard[row][4] = new Queen(true);
				helpArray[row][4] = chessBoard[row][4].getSymbol();

				chessBoard[row][7] = new Rook(true);
				helpArray[row][7] = chessBoard[row][7].getSymbol();

				chessBoard[row][6] = new Knight(true);
				helpArray[row][6] = chessBoard[row][6].getSymbol();

				chessBoard[row][5] = new Bishop(true);
				helpArray[row][5] = chessBoard[row][5].getSymbol();

			} else {
				for (int col = 0; col < helpArray[row].length; col++) {
					helpArray[row][col] = " ";
				}
			}
		}

	}

	int row1, col1, row2, col2;

	// Used for chess piece movement.
	private void beforeMove() {

		String exchange = helpArray[row1][col1];
		helpArray[row2][col2].equals(" ");
		helpArray[row1][col1] = helpArray[row2][col2];
		helpArray[row2][col2] = exchange;

		Piece piece[] = new Piece[1];
		piece[0] = chessBoard[row1][col1];
		chessBoard[row1][col1] = chessBoard[row2][col2];
		chessBoard[row2][col2] = piece[0];
	}

	protected void moveAgain() {
		if (helpArray[row1][col1].equalsIgnoreCase("r")) {
			if (row1 != row2 & col1 != col2) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();

			}
			// If the piece is a white pawn, the move method is called.
			// Otherwise, report a message to the user.
		} else if (helpArray[row1][col1].equals("p")) {
			if (col1 != col2) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();
			} else if (row2 <= row1) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();
			} else if ((row1 != 2) && (row2 > row1 + 2)) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();
			}
			// If the piece is a black pawn, the move method is called.
			// Otherwise, report a message to the user.
		} else if (helpArray[row1][col1].equals("P")) {
			if (col1 != col2) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();

			} else if (row1 <= row2) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();
			} else if ((row1 != 7) && (row1 > row2 + 2)) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();
			}
		} else {// If the conditions are met,
				// the user is prompted to move successfully.
			System.out.println("The move is made. ");
		}
	}

	// the following method is for chess move
	private void moveChess() {
		// Prompt the user to enter the position of the chess they want to move
		// and where they want to move.
		System.out.println("Which piece do you want to move?");

		row1 = userInput("pls enter row number: ") - 1;
		col1 = userInput("pls enter column number: ") - 1;
		while (helpArray[row1][col1].equals(" ")) {
			System.out.println("There is no piece here, pls try again");
			moveChess();
			break;
		}
		System.out.println(chessBoard[row1][col1].getName());
		// For king, queen, knight, bishop, output move not implemented.
		while (helpArray[row1][col1].equalsIgnoreCase("n") || helpArray[row1][col1].equalsIgnoreCase("b")
				|| helpArray[row1][col1].equalsIgnoreCase("k") || helpArray[row1][col1].equalsIgnoreCase("q")) {
			System.out.println("Move functionality not implemented for this piece.");
			moveChess();
			break;
		}
		System.out.println("Where do you want this piece to go?");
		row2 = userInput("pls enter row number:") - 1;
		col2 = userInput("pls enter column number:") - 1;
		while (!helpArray[row2][col2].equals(" ")) {
			System.out.println("This move is invalid, please try again.");
			row2 = userInput("pls enter row number:") - 1;
			col2 = userInput("pls enter column number:") - 1;
			moveAgain();
		}
		// If the piece is a rook, then the move method is called.
		// Otherwise, report a message to the user.
		if (helpArray[row1][col1].equalsIgnoreCase("r")) {
			if (row1 != row2 & col1 != col2) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("pls enter row number:") - 1;
				col2 = userInput("pls enter column number:") - 1;
				moveAgain();
			}
			// If the chess is a white pawn, the move method is called.
			// Otherwise, report a message to the user.
		} else if (helpArray[row1][col1].equals("p")) {
			if (col1 != col2) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("pls enter row number:") - 1;
				col2 = userInput("pls enter column number:") - 1;
				moveAgain();
			} else if (row2 <= row1) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("pls enter row number:") - 1;
				col2 = userInput("pls enter column number:") - 1;
				moveAgain();
			} else if ((row1 != 2) && (row2 > row1 + 2)) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("pls enter row number:") - 1;
				col2 = userInput("pls enter column number:") - 1;
				moveAgain();
			}
			// If the pawn is a black pawn, the move method is called.
			// Otherwise, report a message to the user.
		} else if (helpArray[row1][col1].equals("P")) {
			if (col1 != col2) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();

			} else if (row1 <= row2) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();
			} else if ((row1 != 7) && (row1 > row2 + 2)) {
				System.out.println("This move is invalid, please try again.");
				row2 = userInput("Enter row number:") - 1;
				col2 = userInput("Enter column number:") - 1;
				moveAgain();
			}
		} else {
			System.out.println("The move is made. ");
		}

	}

	// This method is used to ask user to select pieces, no pieces can move besides
	// pawn and rook in this lab.
	private void chosePiece(int row, int col) {
		row = userInput("Enter row number: ") - 1;
		col = userInput("Enter column number: ") - 1;

		if (Lab3.helpArray[row][col] != " ") {

			System.out.println(Lab3.chessBoard[row][col].getName());

			if (Lab3.helpArray[row][col].equalsIgnoreCase("r")) {

			} else if (Lab3.helpArray[row][col].equalsIgnoreCase("p")) {

			} else {
				System.out.println("Move functionality not implemented for this piece.");
			}

		}

		if (Lab3.helpArray[row][col] == " ") {
			do {
				System.out.println("There is no piece, please enter again: ");
				row = userInput("Enter row number: ") - 1;
				col = userInput("Enter column number: ") - 1;
				System.out.println(Lab3.chessBoard[row][col].getName());
				if (!Lab3.helpArray[row][col].equalsIgnoreCase("r") | !Lab3.helpArray[row][col].equalsIgnoreCase("p")) {
					System.out.println("Move functionality not implemented for this piece.");
				}
			} while (Lab3.helpArray[row][col] == " ");
		}
		if (Lab3.helpArray[row][col].equalsIgnoreCase("r")) {
			Rook rook = new Rook();
			rook.getValidMoves(row, col);
		} else if (Lab3.helpArray[row][col] == "p") {
			Pawn pawn = new Pawn();
			pawn.chessColor = false;
			pawn.getValidMoves(row, col);
		} else if (Lab3.helpArray[row][col] == "P") {
			Pawn pawn = new Pawn();
			pawn.chessColor = true;
			pawn.getValidMoves(row, col);
		}
	}

	boolean firstMove = true;

	// The menu method allows the user
	// to select the option they want according to the prompt
	protected void getMenu() {

		// create a menu with four options
		final int MOVE_PIECE = 1;
		final int CHECK_VALID_MOVES = 2;
		final int REDRAW_BOARD = 3;
		String quit = "Q";

		do {
			System.out.println();
			System.out.println("------Menu------ ");
			System.out.println("Please select from one of the following ");
			System.out.println();
			System.out.println(MOVE_PIECE + ". Move a piece.");
			System.out.println(CHECK_VALID_MOVES + ". Check a piece for its valid moves.");
			System.out.println(REDRAW_BOARD + ". Redraw the board.");
			System.out.println("Q. Quit.");
			System.out.println();
			System.out.print("Pls enter your option here: ");

			Scanner rowInput1 = new Scanner(System.in);
			String input1 = rowInput1.next();

			if (input1.equalsIgnoreCase("q")) {
				System.out.println("The Chess Game is over, goodbye!");
				break;
			} else if (input1.matches("1")) {
				moveChess();
			} else if (input1.matches("2")) {
				chosePiece(0, 0);
			} else if (input1.matches("3")) {
				if (firstMove) {// only execute once cause it instantiate chess board.
					iniChessBoard();
					beforeMove();
					drawBoard();
					firstMove = false;
				} else {
					beforeMove();
					drawBoard();
				}
			} else {
				System.out.println("Valid options are 1, 2, 3 or Q.");
			}
		} while (quit != "Quit");

	}

	// method for input
	private int userInput(String prompt) {
		int value;
		String msg = "Input must be an integer between 1 and 8.";
		// break and continue is needed so use while loop.
		while (true) {
			System.out.print(prompt);
			if (keyboard.hasNextInt()) {// Check if the input value is an integer
				value = keyboard.nextInt();
				// if the integer value between 1~8,
				// break to return value.
				// otherwise prompt user to input an integer.
				if (value < 9 && value > 0) {
					break;
				}
				System.out.println(msg);
				continue;
			}
			System.out.println(msg);
			keyboard.next();// clear
		}
		return value;
	}

	// print segments for method drawBoard.
	private void printSegment(String[][] arr, int row, String prompt1, String prompt2, String prompt3) {
		for (int col = 0; col < arr[row].length; col++) {
			if (col == 0) {
				System.out.print(prompt3);
			} else {
				System.out.print(prompt1);
				if (col == 7) {
					System.out.println(prompt2);
				}
			}

		}
	}
}
