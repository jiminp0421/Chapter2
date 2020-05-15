package com.javaex.ex08;

public class Point {

	
	private int x;
	private int y;
	
	
	
	
	//생성자
	
	public Point( ) {}
	
	public Point(int x, int y) {
		//메모리 올리기
		this.x = x;
		this.y = y;
	}
	
	//g/s
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//일반메소드
	
	public void draw() {
		System.out.println("[점x=" + x + "점y=" + y + "]");
	}
	
	
	
	//toString()
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
