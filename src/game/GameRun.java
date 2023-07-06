package game;

import java.util.Scanner;

public class GameRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("무기강화게임");
		System.out.println("1. 게임시작");
		System.out.println("2. 게임종료");
		System.out.print("선택 : ");
		finish: while (true) {
			int gameStart = sc.nextInt();
			switch (gameStart) {
			case 1:
				System.out.println("게임을 시작합니다.");
				menu();
				break;
			case 2:
				System.out.println("게임을 종료합니다.");
				break finish;
			default:
				System.out.println("다시 골라주세요");
			}
		}
	}
	public static void menu() {
		String weapon = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("캐릭터를 생성하세요");
		System.out.print("이름을 정해주세요 : ");
		String name = sc.next();
		System.out.println("무기를 골라주세요(1.검 2.망치 3.활 4.지팡이");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				weapon = "검"; 
				break;
			case 2 : 
				weapon = "망치"; 
				break;
			case 3 : 
				weapon = "활"; 
				break;
			case 4 :
				weapon = "지팡이";
				break;
			default : 
				System.out.println("다시골라주세요");
		}	
	}
	
}
