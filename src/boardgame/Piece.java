package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board tabuleiro) {
		this.board = tabuleiro;
		position = null;
	}

	protected Board getBoartd() {
		return board;
	}

}
