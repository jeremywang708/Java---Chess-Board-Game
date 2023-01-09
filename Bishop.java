
public class Bishop extends Piece {
	
	Bishop(boolean chessColor) {
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
			chess = "B";
		} else if (chessColor == false) {
			chess = "b";
		}
		return chess;
	}

	@Override
	public String getName() {
		String chessName = null;

		if (chessColor == true) {
			chessName = "black Bishop";
		} else if (chessColor == false) {
			chessName = "white Bishop";
		}
		return chessName;
	}

}
