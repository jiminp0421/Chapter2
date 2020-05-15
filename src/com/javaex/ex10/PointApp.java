package com.javaex.ex10;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Point p1 = new Point(5, 5);
		p1.draw(); //1번
		p1.draw(true); //2번
		p1.draw(false); //3번
		//System.out.println(p1.toString());
	}

}
