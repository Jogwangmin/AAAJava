package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

	
public class Exam_DbclickChangeColor extends JFrame{
	
	public Exam_DbclickChangeColor() {
		setTitle("Click and Dbl Click Change BackgroundColor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		setSize(300, 200);
		setVisible(true);
	}

	//	private class MyMouseListener implements MouseListener {
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// 더블 클릭 구현, 클릭 카운트수가 2면 더블클릭
			if(e.getClickCount() == 2) {
				// (int)math.random() * (최댓값 - 최솟값 + 1) + 최소값
				// 0 ~ 255 범위의 랜덤한 수를 출력하는 방법
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(red,green,blue));
			}
		}
	}
	

	public static void main(String[] args) {
		new Exam_DbclickChangeColor();
	}
	

}
