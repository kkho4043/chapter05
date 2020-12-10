package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class PhoneApp {
	public static void main(String[] args) throws IOException{
		Reader pd = new FileReader("C:\\java\\eclipse\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(pd);
		String str;
		String[] sArr;
		ArrayList<Person> plist = new ArrayList<Person>();
		
		while(true) {
			str = br.readLine();
			if(str == null) {
				break;
			}
			sArr = str.split(",");
			
			plist.add(new Person(sArr[0] ,sArr[1],sArr[2]));
		}
		
		allDraw(plist);
		
		Person me = new Person("강태욱", "010-4458-4043", "하이미디어");
		plist.add(me);
		System.out.println("============================");
		allDraw(plist);
		
		
	}
	
	public static void allDraw(List<Person> list) {
		for(int i = 0; i < list.size();i++) {
			list.get(i).draw();
		}
	}
}
