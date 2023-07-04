package com.kh.day07.oop.polymorphism.overriding.exercise;

class SuperClass {
	void paint() { //3
		draw();	   //4
	}
	void draw() {  // 7
		System.out.println("Suber Object"); //8
	}
}
class SubClass extends SuperClass {
	void paint() {  // 1
		super.paint(); // 2
 		super.draw(); // 6
	}
	void draw() {
		System.out.println("Sub Object"); // 5
	}
}
public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}
