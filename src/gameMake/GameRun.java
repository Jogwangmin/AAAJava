package gameMake;

import java.util.Scanner;

public class GameRun {
	public static void main(String[] args) {
		GameFunction gFunc = new GameFunction();
		Scanner sc = new Scanner(System.in);
		end: while (true) {
			int choice = gFunc.printMenu();
			switch (choice) {
			case 1:
				System.out.println("무기 강화 게임에 오신 걸 환영합니다.");
				System.out.println("=============================");
				Game game = gFunc.createCharacter();
				System.out.println("=============================");
				gFunc.gamePlay(game);
				System.out.println("=============================");
				break;
			case 2:
				System.out.println("무기 강화 게임을 종료합니다.");
				break end;
			default:
				System.out.println("다시 골라주세요");
			}
		}
	}
}
