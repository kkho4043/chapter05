package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamApp {
	public static void main(String[] args) throws IOException{
		Writer fw = new FileWriter("C:\\java\\eclipse\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("�б����� ����");
		bw.newLine();
		bw.write("�𿩺���");
		bw.newLine();
		bw.write("��������");
		bw.newLine();
		bw.write("��ٸ��Ŵ�");
		bw.newLine();
		
		bw.close();
	}
}
