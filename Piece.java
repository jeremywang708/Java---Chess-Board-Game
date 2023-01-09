
public abstract class Piece {
	protected boolean chessColor;
	
	// method 1
	protected abstract void getValidMoves(int row, int col);
	
	// method 2
	protected abstract String getSymbol();
	
	// method 3
	protected abstract String getName();

}
