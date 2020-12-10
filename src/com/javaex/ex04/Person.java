package com.javaex.ex04;

public class Person {
	
	//필드
	private String name;
	private String hp;
	private String company;
	
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	public void draw() {
		System.out.println("이름: "+name);
		System.out.println("핸드폰: "+hp);
		System.out.println("회사: "+company);
		System.out.println("");
	}
	
}
