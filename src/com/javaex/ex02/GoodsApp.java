package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Goods computer = new Goods();
		Goods cup = new Goods();
		Goods car = new Goods();
		
		
		
		computer.name = "lgGram";
		computer.price = 900000;
		
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		System.out.println("=============================");
		
		
		cup.name = "mugCup";
		cup.price = 2000;
		
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		System.out.println("=============================");
		
		car.name = "genesis";
		car.price = 60000000;
		
		System.out.println(car.name);
		System.out.println(car.price);
		

		
	}

}
