package com.kh.day06.oop.member;

import java.util.Scanner;

public class MemberRun {
	public static void main(String[] args) {
		
		Member [] memArrs = new Member[3];
		finish :
			while(true) {		
				int choice = printMenu(); 
				switch(choice) {
				case 1 :
					inputMember(memArrs);
					break;
				case 2 :
					printMember(memArrs);
					break;
				case 3 :
					checkBonus(memArrs);
					break;
				case 4 :
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				}
			}
	}
	private static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("회원 정보 확인 프로그램");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 출력");
		System.out.println("3. 회원 혜택");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}

	private static void inputMember(Member[] memArrs) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < memArrs.length; i++) {
			System.out.println((i+1)+"번째 회원정보 등록 : ");
			System.out.print("회원이름 : ");
			String name = sc.next();
			System.out.print("전화번호 : ");
			String phone = sc.next();
			System.out.print("회원등급 : "); // gold, silver, bronze
			String level = sc.next();
			memArrs[i] = new Member();
			memArrs[i].setName(name);
			memArrs[i].setPhone(phone);
			memArrs[i].setLevel(level);
		}
	}

	private static void printMember(Member[] memArrs) {
		for(int i = 0; i < memArrs.length; i++) {
			System.out.println("회원이름 : " + memArrs[i].getName());
			System.out.println("전화번호 : " + memArrs[i].getPhone());
			System.out.println("회원등급 : " + memArrs[i].getLevel());
		}
		
	}

	private static void checkBonus(Member[] memArrs) {
		
		
	}

}
