package boardgame;

public class Board {
	private int rows;
	private int collumns;
	private Piece[][] pieces;

	public Board(int rows, int collums) {
		if (rows < 1 || collums < 1) {
			throw new BoardException("Erro ao criar o tabuleiro, é necessário que tenha pelo menos 1 linha e 1 coluna");
		}
		this.rows = rows;
		this.collumns = collums;
		pieces = new Piece[rows][collums];
	}

	public int getRows() {
		return rows;
	}

	public int getCollumns() {
		return collumns;
	}

	public Piece piece(int row, int collum) {
		if (!positionExists(row, collum)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[row][collum];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getCollumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça na posição " + position);
		}
		pieces[position.getRow()][position.getCollumn()] = piece;
		piece.position = position;
	}

	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getCollumn()] = null;
		return aux;
	}

	public boolean positionExists(int row, int collumn) {
		return row >= 0 && row < rows && collumn >= 0 && collumn < collumns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getCollumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return piece(position) != null;
	}

}
