package com.kh.day13.swing.student.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day10.collection.student.Student;

public class StudentView {
	List<Student> stdList;
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 수정"); // 추가
		System.out.println("4. 학생 정보 삭제(이름)"); // 추가
		System.out.println("5. 학생 정보 전체(전체)"); // 추가
		System.out.println("6. 학생 정보 전체 출력"); // 추가
		System.out.println("7. 재평가 대상 여부 확인");
		System.out.println("8. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	public Student inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
//		stdList.add(std);
		return std;
	}
	public void printInfo() {
		System.out.println("학생 정보 전체 출력");
		for(Student student : stdList) {
			System.out.println(student.toString());
		}
	}
	public void checkPass() {
		for(Student student : stdList) {
			int score1 = student.getScore1();
			int score2 = student.getScore2();
		}
	}
	public void searchInfoByName() {
		System.out.println("학생 정보 이름 검색");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for(Student std : stdList) {
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
		
	}
}
