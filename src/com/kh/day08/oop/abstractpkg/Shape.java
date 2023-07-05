package com.kh.day08.oop.abstractpkg;

abstract class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw() 추상 메소드 오버라이딩해야함, 안할거면 class에 abstract 붙여야함
	@Override
	public void draw() {
		
	}
}

public abstract class Shape {

	public Shape() {}
	
	public void paint() {}
	abstract public void draw(); 
	// 1. Abstract methods do not specify a body = abstract 메소드는 {} 몸체를 가질수 없다.
	// 2. The abstract method draw in type Shape can only be defined by an abstract class ,abstract가 있을라면 abstract 클래스여야 한다 
	// 3. The type Shape must be an abstract class to define abstract methods 클래스에 abstract 붙여야함
}
