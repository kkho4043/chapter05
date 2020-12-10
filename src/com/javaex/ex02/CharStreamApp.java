package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamApp {
	public static void main(String[] args) throws IOException{
		Writer fw = new FileWriter("C:\\java\\eclipse\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 땡떙");
		bw.newLine();
		bw.write("모여보자");
		bw.newLine();
		bw.write("선생님이");
		bw.newLine();
		bw.write("기다리신다");
		bw.newLine();
		
		bw.close();
	}
}
