package com.javaex.ex04;

public class Goods { //Goods 라는 붕어빵 틀을 만들었어요

	
	private String name; //private을 붙여 접근 불가능 상태가 되었어요.
	private int price;
	
	
	public void setName(String n) { //접근 불가능 상태이므로 새로운 이름을 붙였습니다.
							//setName이라는 이름을 사용자가 부여해줍니다 "너 이름좀 출력해줘 void는 대답할 필요없이 도와줍니다."
		name = n;			//private때문에 막힌 name을 n이라는 이름을 사용하여 다시 쓸수있도록 합니다. 
						//name = n;을 쓴 이유가 그것입니다.
	}					//그러면 메모리에 니콘이라는 이름을 사용할수있게 됩니다.
						//
	
	public String getName() { //get네임은 니콘이라는 이름을 출력해줄거예요.
		return name;
	}
	
	public void setPrice(int p) { //접근 불가능 상태이므로 새로운 이름을 붙였습니다.
		price = p;			//p라는 이름을 사용하여 가격을 넣어줄거예요
	}
	public int getPrice() { //get은 가격을 출력해줄거예요.
		return price;
	}	
	
	
	
	
	public void showInfo() {
		System.out.println("상품명: " + name + "\t가격:" + price);
	} //만약 상품명만 출력하면 상관없지만 #을 붙이라고 한 경우 println을 다찾아서 해야하지만 이런식으로 식을 만들면 쉽게 전체에 #을 붙일수있어요
	
}
