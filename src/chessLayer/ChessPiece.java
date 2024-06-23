package chessLayer;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {

	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	private Color color;

	public Color getColor() {
		return color;
	}

	
	
}
