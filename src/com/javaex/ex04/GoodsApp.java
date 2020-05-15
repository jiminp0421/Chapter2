package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Goods camera = new Goods();
	
	camera.setName("니콘");    
	camera.setPrice(400000);
	//System.out.println(camera.getName());
	//System.out.println(camera.getPrice());
	camera.showInfo(); //출력까지 알아서 다 해준다.
	
	Goods cup = new Goods();
	
	cup.setName("머그컵");
	cup.setPrice(2000);
	//System.out.println(cup.getName());
	//System.out.println(cup.getPrice());
	cup.showInfo();
	
	}

}
