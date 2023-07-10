package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {
	public static void main(String[] args) {
//		문자 스트림 FileReader와 FileWriter를 이용하여 
//		c:\windows\system.ini를 c:\Temp\system.txt 파일로 복사하는 프로그램을 작성하라.
		Reader reader = null;
		Writer writer = null;
		File src = new File("c:\\windows\\system.ini"); // 원본 파일 경로명
		File dest = new File("c:\\Temp\\system.txt");   // 복사 파일 경로명
		try {
			reader = new FileReader(src);
			// 파일 입출력을 이용한 폴더 만들기 폴더가 있는지없는지 체크해서 만듬
			if(!dest.exists()) { // 이렇게해도됨
				dest.mkdir();
			}
//			File folderMake = new File("c:\\Temp");
//			if(!folderMake.exists()) {
//				folderMake.mkdir();
//			}
			writer = new FileWriter(dest);
			int readChar; // 읽은 문자
			while(true) {
				readChar = reader.read(); 
				if(readChar == -1) break;
				// write메소드 자리임. 왜나하면 읽은 값을 써서 파일에 저장해야되기 때문
				writer.write((char)readChar); // 문자로 쓸수있도록 (char)
			}
			System.out.println("복사완료");
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
}
