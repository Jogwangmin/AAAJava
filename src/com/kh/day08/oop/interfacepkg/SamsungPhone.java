package com.kh.day08.oop.interfacepkg;

// 1. The type PhoneInterface cannot be the superclass of SamsungPhone; 
// a superclass must be a class / extends는 클래스에서만 쓸수있음
public class SamsungPhone implements PhoneInterface {
// 2. The type SamsungPhone must implement 
// the inherited abstract method PhoneInterface.receiveCall() => 오버라이딩 해야함
	@Override
	public void receiveCall() {
		System.out.println("여보세여 나야");
	}

	@Override
	public void sendCall() {
		System.out.println("뚜루루루");
	}

	@Override
	public void printLogo() {
		System.out.println("====== SAMSUNG ======");
	}
	

}
