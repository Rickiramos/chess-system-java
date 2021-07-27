package boardgame;

public class Board {
	private int rows;
	private int colunns;
	private Piece[][] pieces;
	
	public Board(int rows, int colunns) {
	
		this.rows = rows;
		this.colunns = colunns;
		pieces = new Piece [rows][colunns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColunns() {
		return colunns;
	}

	public void setColunns(int colunns) {
		this.colunns = colunns;
	} 

	
	
}
