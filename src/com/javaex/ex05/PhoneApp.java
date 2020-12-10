package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;


public class PhoneApp {
	public static void main(String[] args) throws IOException{
		Reader pd = new FileReader("C:\\java\\eclipse\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(pd);
		
		Writer pw= new FileWriter("C:\\java\\eclipse\\myperson.txt");
		BufferedWriter bw = new BufferedWriter(pw);
		
		
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
		
		String my = "강태욱,01044584043,하이미디어";
		sArr = my.split(",");
		plist.add(new Person(sArr[0],sArr[1],sArr[2]));
		
		for(int i = 0; i < plist.size();i++) {
			bw.write(backtolist(plist, i));
		}
		
		bw.close();
		br.close();
		
		//내이름 추가 해서 파일 만들기
		
		//내이름 추가한거 출력하기
		System.out.println("========= me 추가 =============");
		Reader mr= new FileReader("C:\\java\\eclipse\\myperson.txt");
		BufferedReader bmr = new BufferedReader(mr);
		
		
		ArrayList<Person> mlist = new ArrayList<Person>();
		
		while(true) {
			str = bmr.readLine();
			
			if(str == null) {
				break;
			}
			sArr = str.split(",");
			
			mlist.add(new Person(sArr[0] ,sArr[1],sArr[2]));
		}
		
		allDraw(mlist);
		
		
		
		
		
		
	}
	public static String backtolist(List<Person> list,int i) {
		
		String str = list.get(i).getName() + "," +list.get(i).getHp() + "," + list.get(i).getCompany()+ "\n";
		return str;
		
	}
	public static void allDraw(List<Person> list) {
		for(int i = 0; i < list.size();i++) {
			list.get(i).draw();
		}
	}
}
