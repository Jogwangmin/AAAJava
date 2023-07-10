package gameMake;

import java.util.Random;
import java.util.Scanner;

public class GameFunction {

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("무기강화게임");
		System.out.println("1. 게임시작");
		System.out.println("2. 게임종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public Game createCharacter() {
		String weapon = "";
		int level = 0;
		int money = 0;
		int boss = 200;
		Scanner sc = new Scanner(System.in);
		System.out.println("캐릭터를 생성하세요");
		System.out.print("이름을 정해주세요 : ");
		String name = sc.next();
		System.out.println("무기를 골라주세요(1.검 2.망치 3.활 4.지팡이)");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			weapon = "검";
			break;
		case 2:
			weapon = "망치";
			break;
		case 3:
			weapon = "활";
			break;
		case 4:
			weapon = "지팡이";
			break;
		default:
			System.out.println("다시 골라주세요");
		}
		System.out.println("당신의 이름 : " + name);
		System.out.println("당신의 무기 : " + weapon + level + "강");
		System.out.println("초기지원 " + 3000 + "원");
		money += 3000;
		return new Game(name, weapon, level, money, boss);
	}

	public void gamePlay(Game game) {
		Scanner sc = new Scanner(System.in);
		end: while (true) {
			System.out.println("1. 내 정보");
			System.out.println("2. 무기 강화하기");
			System.out.println("3. 돈 벌기");
			System.out.println("4. 보스 죽이기");
			System.out.println("5. 메인으로");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println(game.getName() + "님의 정보");
				System.out.println("무기 : " + game.getWeapon() + game.getLevel() + "강");
				System.out.println("소지금 : " + game.getMoney() + "원");
				break;
			case 2:
				Random rand = new Random();
				if (game.getMoney() >= 1000) {
					game.setMoney(game.getMoney() - 1000);
					int upgrade = rand.nextInt(50);
					System.out.println(game.getWeapon() + game.getLevel() + "강" + " 강화 시도");
					System.out.println("1000원 차감");
					System.out.println("현재 소지금 : " + game.getMoney());
					if (upgrade == 5 || upgrade == 9 || upgrade == 14 || upgrade == 18 || upgrade == 22 || upgrade == 31
							|| upgrade == 37 || upgrade == 39 || upgrade == 40 || upgrade == 50) {
						System.out.println("강화 실패");
						System.out.println("변동없음");
					} else if (upgrade == 1 || upgrade == 22 || upgrade == 35 || upgrade == 49) {
						System.out.println("저런ㅋㅋ 무기가 터져버렸어요~");
						game.setLevel(0);
					} else {
						System.out.println("강화 성공");
						System.out.println("강화 성공! " + game.getWeapon() + game.getLevel() + "강" + " -> "
								+ game.getWeapon() + game.getLevel() + "강");
						game.setLevel(game.getLevel() + 1);
					}
					System.out.println("현재 무기 : " + game.getWeapon() + game.getLevel() + "강");
				} else {
					System.out.println("강화 비용이 부족합니다.");
				}
				break;
			case 3:
				System.out.println("무슨 일을 할까?");
				System.out.println("1. 전단지 알바(2000원)");
				System.out.println("2. 인형탈 알바(3000원)");
				System.out.println("3. 상하차 알바(4000원)");
				int work = sc.nextInt();
				switch (work) {
				case 1:
					System.out.println("전단지 알바를 한다.");
					System.out.println("전단지 몇 개는 길바닥에 몰래 버렸다...");
					System.out.println("2000원을 벌었다!");
					game.setMoney(game.getMoney() + 2000);
					break;
				case 2:
					System.out.println("인형탈 알바를 한다.");
					System.out.println("지나가던 꼬맹이들이 발로 찬다... 참는다...");
					System.out.println("3000원을 벌었다!");
					game.setMoney(game.getMoney() + 3000);
					break;
				case 3:
					System.out.println("상하차 알바를 한다.");
					System.out.println("...");
					System.out.println("4000원을 벌었다.");
					game.setMoney(game.getMoney() + 4000);
					break;
				}
				System.out.println("현재 소지금 : " + game.getMoney());
				break;
			case 4:
				if (game.getBoss() > 0) {
					System.out.println("보스의 체력 : " + game.getBoss());
					System.out.println("보스를 " + game.getWeapon() + game.getLevel() + "강으로 공격한다!");
					if (game.getLevel() == 3) {
						System.out.println("보스가 콧방귀를 낀다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else if (game.getLevel() == 4) {
						System.out.println("보스가 간지러워한다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else if (game.getLevel() == 5) {
						System.out.println("보스가 침을 뱉는다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else if (game.getLevel() == 6) {
						System.out.println("보스가 살짝 쪼는 것 같다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else if (game.getLevel() == 7) {
						System.out.println("보스가 몸을 약간 움츠렸다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else if (game.getLevel() == 8) {
						System.out.println("보스가 아파한다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else if (game.getLevel() == 9) {
						System.out.println("보스가 눈물을 흘린다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else if (game.getLevel() == 10) {
						System.out.println("보스가 피를 흘린다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else if (game.getLevel() > 10) {
						System.out.println("보스가 살려달라 애원한다.");
						game.setBoss(game.getBoss() - game.getLevel() * 2);
					} else {
						System.out.println("무기가 너무 형편없어 공격이 통하지 않는다.");
					}
					System.out.println("보스 체력 : " + game.getBoss());
					if (game.getBoss() <= 0) {
						System.out.println("보스가 죽었습니다.");
						System.out.println("처치 보상 : +1,000,000원");
						game.setMoney(game.getMoney() + 1000000);
					}
				} else {
					System.out.println("보스가 죽었습니다.");
				}
				break;
			case 5:
				System.out.println("메인으로");
				break end;
			}
			System.out.println("=============================");
		}
	}
}
