package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) { //main이 있어서 스토리가 가능 붕어빵의 시나리오
		// TODO Auto-generated method stub

		Goods camera = new Goods(); // new goods 라는 메모리에 올라왔다 
		
		
		camera.name = "NIKON"; //틀에 올려놓은 메모리다. 틀은 도장찍고 끝 
		camera.price = 400000;
		
		
		System.out.println(camera.name);
		System.out.println(camera.price);
	}

}
