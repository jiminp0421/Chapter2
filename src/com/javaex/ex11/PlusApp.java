package com.javaex.ex11;

public class PlusApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Plus p = new Plus();
		p.plus(3, 5);
		p.plus(3.2, 6.6); //원래는 double이니까 메소드가 달라야 하지만 안해도된다
		p.plus("안녕", "하세요");
		
		
		
		
		
	}

}
