package com.kh.day13.swing.basic;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_NullLayout extends JFrame{
	
	public Exam_NullLayout() {
		setTitle("Null Layout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("Hello, press Buttons");
		la.setLocation(130, 50); // 좌표
		la.setSize(200, 20); // 사이즈
		c.add(la);
		
		for(int i = 1; i <= 9; i++) {
			JButton btn = new JButton(String.valueOf(i)); // i는 int이기에 String으로 바꿔줌
			btn.setLocation(i*15, i*15); // 좌표
			btn.setSize(50, 20);
			c.add(btn);
		}
		
		
		setSize(300, 200);
		setVisible(true);
		
	};
	
	
	public static void main(String[] args) {
		new Exam_NullLayout();
	}
}
