package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Rectangle {
// 너비와 높이를 입력받아 사각형의 넓이를 출력하는 프로그램을 작성하라.
// 너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진
// Rectangle 클래스를 만들어라.
	public int width; // 너비
	public int height; // 높이
	// =========================> 필드
	public Rectangle() {
		
	}
	// =========================> 생성자
	public int getArea() {  // 사각형의 넓이를 구해주는 메소드
		return width*height;
	}
	// =========================> 메소드
	public static void main(String [] args) {
		Rectangle room = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("너비를 입력하세요 : ");
		room.width = sc.nextInt();
		System.out.print("높이를 입력하세요 : ");
		room.height = sc.nextInt();
		int area = room.getArea();
		System.out.println("방의 면적은 " + area);
	}
}
