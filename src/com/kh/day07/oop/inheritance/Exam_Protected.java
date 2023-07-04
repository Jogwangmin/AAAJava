package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
	
}

class Child extends Parent {
	private int childMoney;
	public Child() {}
	void set() {
		super.pub = 1;
		super.def = 1;
		super.pro = 1;
//		super.pri = 4; The field Parent.pri is not visible
	}
}

class ShapePoint extends Point {
	private String shape;
	public ShapePoint() {}
	void set() {
		super.pub = 1;
//		super.def = 2; The field Point.def is not visible. def가 보이지않아 쓸수없다.
		super.pro = 3; // 상속관계에 있기때문에 다른 패키지에 있어도 접근이 가능함
//		super.pri = 4; The field Parent.pri is not visible
	}
}

public class Exam_Protected {
	public static void main(String[] args) {
		
	}
}
