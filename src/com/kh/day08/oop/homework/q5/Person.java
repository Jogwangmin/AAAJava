package com.kh.day08.oop.homework.q5;

public class Person {
	// 이름
	String name;
	// 돈
	int money;

	public Person() {}
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 커피 사먹기
	public void buyCoffe(Cafe caffe, int money) {
		// 돈을 가지고 커피가 나와야 함.
//		this.money = this.money - money;
		this.money -= money; // Person의 money - buyCoffe의 money
		caffe.makeCoffee(money);
	}
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.");
	}
}
