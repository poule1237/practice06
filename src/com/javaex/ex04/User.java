package com.javaex.ex04;

public class User {
	
	//필드
	private String id;
	private String password;
	private String name;
	
	//생성자
	public User() {
		
	}
	
	public User(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}


	//메소드 gs
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	public void showinfo() {
		
	}
	
	
}
