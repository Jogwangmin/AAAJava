package com.kh.day09.wrapperpkg;

public class Exam_Wraaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Integer su = Integer.valueOf(0); // 메소드가 기울어져있다 static메소드
		// The constructor Integer(int) has been *deprecated since version 9 and marked for removal
		su = new Integer(0);	// new를 쓰면 해당 기능이 없어지니 쓰지말아라
//		su = null; // null 체크가 가능하다
		// 박싱과 언박싱
		su = Integer.valueOf(1026);
		su = 1026; // 오토-박싱 숫자넣어도 되게해줌
		
		int suNum = su.intValue();
		suNum = su; // 오토-언박싱 꺼내서 씀
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay); // 문자열이 숫자로 됨
		
		System.out.println(Character.toLowerCase('A')); // 소문자로 바꿔줌
		System.out.println(Character.toUpperCase('a')); // 대문자로 바꿔줌
		
		char c1 = '4', c2 = 'F'; 
		if(Character.isDigit(c1)) { // 숫자인지 물어보는것
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}

}
