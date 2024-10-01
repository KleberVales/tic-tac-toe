package tic_tac_toe;

public class Field {
	private char symbol;
	public Field() {
		this.symbol=' ';
		
	}
	public char getSymbol() {
		return this.symbol;
	}
	public void setSymbol() {
		if(this.symbol==' ') {
			this.symbol=symbol;
		}else {
			System.out.println("Used field");
		}
	}
}
