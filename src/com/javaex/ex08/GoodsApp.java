package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//디폴트 생성자 이용해서 인스턴스생성
		//setter로 데이타입력
		//toString() 확인
		Point p1 = new Point(); //플레이버튼을 눌렀을때 메모리에 저장된다
		p1.setX(5);
		p1.setY(5);
		System.out.println(p1.toString());
		
		//x, y 값을 같이 세팅해서 생성자 이용-->추가로 만들어야함
		//toString()확인 <--디폴트 생성자 오류 확인
		
		Point p2 = new Point(10,10);
		System.out.println(p2.toString());
		
		
		//오류제거 --> 디폴트 생성자를 만든다
		
	}

}
