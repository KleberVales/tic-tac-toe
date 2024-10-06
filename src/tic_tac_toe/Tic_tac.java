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
			victory=checkVitory(old);
			if(!victory.equals("")) {
				System.out.printf("player %s win%n", victory);
				break;
			}
			try {
				if(checkGame(old, play(scan, currentSymbol), currentSymbol )) {
					
				}
			
			}catch(Exception e) {
				System.out.printf("Erro");
			}
		}
		System.out.printf("Fim do jogo");
	}
	
	public static void drawGame(Field[][] old) {
		//clearScreen();
		System.out.println(" 0 1 2");
		System.out.printf("0 %c | %c | %c %n", old[0][0].getSymbol(),old[0][1].getSymbol(),old[0][2].getSymbol());
		System.out.printf("---------------");
		System.out.printf("1 %c | %c | %c %n", old[1][0].getSymbol(),old[1][1].getSymbol(),old[1][2].getSymbol());
		System.out.printf("---------------");
		System.out.printf("2 %c | %c | %c %n", old[2][0].getSymbol(),old[2][1].getSymbol(),old[2][2].getSymbol());

		
		
	}
	
	public static void clearScreem() {
		for(int cont=0; cont < 200; cont++) {
			System.out.println("");
		}
	}
	
	public static int[] play(Scanner scan, char sa) {
		int p[] = new int[2];
		System.out.printf("%s %c%n", "Who play: ", sa);
		System.out.print("Show the line: ");
		p[0]=scan.nextInt();
		System.out.print("Show the column: ");
		p[1]=scan.nextInt();
		return p;
	}
	
	public void boolean checkGame(Field[][] old, int p[], char currentSymbol) {
		if(old[p[0]][p[1]].getSymbol()==' ') {
			old[p[0]][p[1]].setSymbol(currentSymbol);
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public static String checkVitory(Field[][] old) {
		return "";
	}
	
}
