package com.kh.day02.loop.exercise;

public class Exercise_While2 {
	public static void main(String [] args) 
	{
	// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
	int i = 0;
	int sum = 0;
	while(i < 100) {
		i++;
		if(i % 2 != 0) {
			sum += i;
		}
	}
	System.out.print("1 ~ 100 사이의 홀수의 합 : " + sum);
	}
}
