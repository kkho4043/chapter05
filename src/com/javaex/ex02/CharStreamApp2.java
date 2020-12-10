package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {
	public static void main(String[] args) throws IOException{
		
		//Reader fr = new FileReader("C:\\java\\eclipse\\song.txt");
		Reader fr = new FileReader("C:\\java\\eclipse\\MS949.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				
				break;
			}
			System.out.println(str);
		}
		
		
		fr.close();
	}
}
