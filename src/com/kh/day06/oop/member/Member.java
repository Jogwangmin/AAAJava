package com.kh.day06.oop.member;

public class Member {
	// 입력받을거 3개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	// 회원등록 : 이름, 전화번호, 등급
	// 회원출력 : 
	// 혜택 : 
	private String name;
	private String phone;
	private String level;
	private int bonus;

	public double getBonusRatio() {
		switch(level) {
		case "gold" : 
			System.out.println("할인율은 15%이며 포인트적립은 6%입니다.");
			break;
		case "silver" :
			System.out.println("할인율은 10%이며 포인트적립은 4%입니다.");
			break;
		case "bronze" :
			System.out.println("할인율은 5%이며 포인트적립은 2%입니다.");
			break;
		}
		return bonus;
	}
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getLevel() {
		return this.level;
	}
	public int getBonus() {
		return this.bonus;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
