package com.javaex.ex09;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//디폴트 생성자 이용해서 인스턴스생성
		//setter로 데이타입력
		//toString() 확인
		
		Song s1 = new Song(); //플레이버튼을 눌렀을때 메모리에 저장된다
		s1.setArtist("아이유");
		s1.setTitle("좋은날");
		s1.setComposer("이민수");
		s1.setTrack("3번째");
		s1.setAlbum("Real");
		s1.setYear(2010);
		System.out.println(s1.toString());
				
				
		//x, y 값을 같이 세팅해서 생성자 이용-->추가로 만들어야함
		//toString()확인 <--디폴트 생성자 오류 확인
				
		Song s2 = new Song("아이유", "좋은날", "이민수", "3번째", "Real", 2010);
		System.out.println(s2.toString());
				
				
		//오류제거 --> 디폴트 생성자를 만든다
	}

}
