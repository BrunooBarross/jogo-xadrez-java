package boardgame;

public class Position {
	private int row;
	private int collum;

	public Position(int linha, int coluna) {
		this.row = linha;
		this.collum = coluna;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int linha) {
		this.row = linha;
	}

	public int getCollum() {
		return collum;
	}

	public void setCollum(int coluna) {
		this.collum = coluna;
	}

	@Override
	public String toString() {
		return row + ", " + collum;
	}
}
