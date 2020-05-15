package com.javaex.ex07;

public class GoodsApp {

	public static void main(String[] args) {

		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		System.out.println(camera.toString());
		
		
		Goods cup = new Goods("mugCup", 2000);
		System.out.println(cup.toString());
		
		Goods computer = new Goods("lg Gram");
		System.out.println(computer.toString());
		
	}

}
