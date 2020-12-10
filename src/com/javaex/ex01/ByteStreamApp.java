package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("C:\\java\\eclipse\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\java\\eclipse\\buffimg.jpg");
		
		byte[] buff = new byte[1024];
		while(true) {
			int bdata = in.read(buff);
			if(bdata == -1) {
				System.out.println("복사끝");
				break;
			}
			out.write(buff);
		}
		out.close();
		in.close();
		/*InputStream in = new FileInputStream("C:\\java\\eclipse\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\java\\eclipse\\byteimg.jpg");
		
		
		System.out.println("복사시작");
		while(true) {
			int bData = in.read();
			
			
			if(bData == -1) {
				System.out.println("복사끝");
				break;
			}
			
			out.write(bData);
		}
		out.close();
		in.close();*/
		
	}
}
