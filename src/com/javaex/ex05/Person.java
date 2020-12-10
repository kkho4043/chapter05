package com.javaex.ex05;

public class Person {
	
	//필드
	private String name;
	private String hp;
	private String company;
	
	
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getHp() {
		return hp;
	}

	protected void setHp(String hp) {
		this.hp = hp;
	}

	protected String getCompany() {
		return company;
	}

	protected void setCompany(String company) {
		this.company = company;
	}

	public Person() {
		
	}
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
