package com.kh.day06.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int index = 0;
	public static void main(String [] args) 
	{
//		Student stdOne = new Student();
		Student [] stds = new Student[3];
//		===== 메인 메뉴 ======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 1
		Scanner sc = new Scanner(System.in);
		for(;;) {
			printMenu();
			int choice = sc.nextInt();
			if(choice == 1) {
				inputScore(stds);		
			}else if(choice == 2) {
				printScore(stds);
			}else if(choice == 3){
				showGoodBye();
				break;
			}else {
				printException();
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("===== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore(Student [] stds) {
//		===== 성적 입력 =====
//		국어 : 
//		영어 : 
//		수학 : 
		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < stds.length; i++) {
			stds[index] = new Student();
			System.out.println("===== 이름 입력 =====");
			System.out.print("이름 : ");
			// 문자열 입력받는 메소드 next(), nextLine()
			// next() : 공백없는 문자열 ex. 이름, ....
			// nextLine() : 공백있는 문자열 ex. 주소, ...
			stds[index].name = sc.next(); // nextLine() 쓸거면 sc.nextLine() 추가해줘야함
			System.out.println("===== 성적 입력 =====");
			System.out.print("국어 : ");
			stds[index].kor = sc.nextInt();
			System.out.print("영어 : ");
			stds[index].eng = sc.nextInt();
			System.out.print("수학 : ");
			stds[index].math = sc.nextInt();	
			sc.nextLine();		// 개행 입력 받아줌
			if(index < stds.length) index++;
//		}
	
	}
	
	public static void printScore(Student [] stds) {
//		===== 성적 출력 ======
//		국어 : 100
//		영어 : 100
//		수학 : 200
//		총점 : 400
//		평균 : 133.33
		for(int i = 0; i < index; i++) {
			System.out.println("===== 성적 출력 ======");
			System.out.printf("이름 : %s\n", stds[i].name);
			System.out.printf("국어 : %d\n", stds[i].kor);
			System.out.printf("영어 : %d\n", stds[i].eng);
			System.out.printf("수학 : %d\n", stds[i].math);
			System.out.printf("총점 : %d\n", stds[i].getTotal());
			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
		}

	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요");
	}
}
