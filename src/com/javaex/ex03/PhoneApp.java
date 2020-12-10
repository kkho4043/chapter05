package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		Reader pd = new FileReader("C:\\java\\eclipse\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(pd);
		String str;
		String[] sArr;
		String name,hp,company;
		while(true) {
			str = br.readLine();
			if(str == null) {
				break;
			}
			sArr = str.split(",");
			name = sArr[0];
			hp = sArr[1];
			company = sArr[2];
			
			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);
			System.out.println("");
			
		}
	}

}