package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char [] cBuf = new char[3]; // 크기가 3인 바가지, 세개씩 읽어줌
//			int i = 0;
			String result = "";
			while(true) {
				readCharCount = reader.read(cBuf);
//				System.out.print(readCharCount);
				if(readCharCount == -1) break;
				result += new String(cBuf, 0,readCharCount); // cBuf을 0부터 읽은데까지만
//				for(char c : cBuf) {
//					System.out.print(c);
//				}
//				System.out.println();
//				i++;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
