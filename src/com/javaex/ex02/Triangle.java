package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int Width;
	private int height;
	
	Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}
	
	public Triangle(int width, int height) {
		super();
		Width = width;
		this.height = height;
	System.out.println("생성자 Triangle(2) 실행");	
	}



	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		Width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}
	
	
}


