package com.javaex.ex05;

public class Point {
	
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) { 
		this.y = y;
	}
	public int getX() { //{}는 독립된 기능 return x는 private x이다.
		return x;		
	}
	public int getY() {
		return y;
	}

	public void draw() {
		System.out.println("점 [x=" + x + ", y=" + y + "]을 그렸습니다.");
		}
	
	
}