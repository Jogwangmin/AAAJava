package com.kh.day05.oop;

public class Circle {
	
	public int radius; // 원의 반지름
	
	public String name; // 원의 이름
	
	// ===================================> 필드
	
	public Circle() {  // 생성자
		
	}
	// ===================================> 생성자
	public double getArea() {  // 원의 넓이를 구해주는 메소드
		return 3.14*radius*radius;
	}
	// ====================================> 메소드

	public static void main(String [] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "청년피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "청년도넛";
		area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f", donut.name, area);
	}
}

