package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point();
		
		
		p1.setX(5); //this는 p1,p2이다 this는 private int x,y이다.
		p1.setY(5); //private int x, y = this = p1, p2
		
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		p1.draw();
		p2.draw();
		
	}

}
