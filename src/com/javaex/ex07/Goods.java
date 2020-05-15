package com.javaex.ex07;

public class Goods {

	
	private String name;
	private int price;
	
	
	

	public Goods(String name) {
		this.name = name;
	}
	
	
	public Goods() {} // 쓰지않아도 작동하는 아이 하지만 경우의 수가 생기면 다시 써줘야한다
						//생성자 규칙,default의 쓰임 꼭 알기
	
	public Goods(String name, int price) { 
		//memory
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	@Override //내부개발용
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	
}
