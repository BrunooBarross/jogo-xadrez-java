package boardgame;

public class Position {
	private int row;
	private int collumn;

	public Position(int linha, int coluna) {
		this.row = linha;
		this.collumn = coluna;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int linha) {
		this.row = linha;
	}

	public int getCollumn() {
		return collumn;
	}

	public void setCollum(int coluna) {
		this.collumn = coluna;
	}

	@Override
	public String toString() {
		return row + ", " + collumn;
	}
}
