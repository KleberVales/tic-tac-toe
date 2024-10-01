package tic_tac_toe;

import java.util.Scanner;

public class Tic_tac {
	public static void main(String[] args) {
		Field[][] old=new Field[3][3];
		char currentSymbol = 'x';
		boolean game=true;
		String victory="";
		Scanner scan=new Scanner(System.in);
		
		while(game) {
			drawGame(old);
		}
	}
	
	public static void drawGame(Field[][] old) {
		//clearScreen();
		System.out.println(" 0 1 2");{
		System.out.printf("0 %c | %c | %c %n", old[0][0].getSymbol(),old[0][1].getSymbol(),old[0][2].getSymbol());
		System.out.printf("---------------");
		System.out.printf("1 %c | %c | %c %n", old[1][0].getSymbol(),old[1][1].getSymbol(),old[1][2].getSymbol());
		System.out.printf("---------------");
		System.out.printf("2 %c | %c | %c %n", old[2][0].getSymbol(),old[2][1].getSymbol(),old[2][2].getSymbol());

		}
	}
	
}
