package com.kh.day08.oop.interfacepkg.zoo;

public class Cat extends Animal implements FoodInterface{

	public String animalFood() {
		return "fish";
	}
	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return null;
	}
}
