
public class Queen extends Piece {
	
	Queen(boolean chessColor) {
		this.chessColor = chessColor;
	}
	
	@Override
	public void getValidMoves(int row, int col) {
		System.out.println("Move functionality not implemented for this piece.");
	}

	@Override
	public String getSymbol() {
		String chess = null;

		if (chessColor == true) {
			chess = "Q";
		} else if (chessColor == false) {
			chess = "q";
		}
		return chess;
	}

	@Override
	public String getName() {
		String chessName = null;

		if (chessColor == true) {
			chessName = "black Queen";
		} else if (chessColor == false) {
			chessName = "white Queen";
		}
		return chessName;
	}

}
