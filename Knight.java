
public class Knight extends Piece {
	
	Knight(boolean chessColor) {
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
			chess = "N";
		} else if (chessColor == false) {
			chess = "n";
		}
		return chess;
	}

	@Override
	public String getName() {
		String chessName = null;

		if (chessColor == true) {
			chessName = "black Knight";
		} else if (chessColor == false) {
			chessName = "white Knight";
		}
		return chessName;
	}

}
