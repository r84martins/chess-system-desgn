package boardgame;

public class Position {
	
	private int row;
	private int column;
	public Position(int roll, int column) {
		this.row = roll;
		this.column = column;
	}
	public int getRoll() {
		return row;
	}
	public void setRoll(int roll) {
		this.row = row;
	}
	public int getColunm() {
		return column;
	}
	public void setColunm(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
