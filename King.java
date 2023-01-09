
public class King extends Piece {
	
	King(boolean chessColor) {
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
			chess = "K";
		} else if (chessColor == false) {
			chess = "k";
		}
		return chess;
	}

	@Override
	public String getName() {
		String chessName = null;

		if (chessColor == true) {
			chessName = "black King";
		} else if (chessColor == false) {
			chessName = "white King";
		}
		return chessName;
	}

}
