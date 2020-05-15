package com.javaex.ex06;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song s1 = new Song(); // new Song은 메소드가 아니라 생성자이다
		Song s2 = new Song();
		Song s3 = new Song();
		
		s1.setArtist("아이유");
		s1.setTitle("좋은날");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setTrack("3번 track");
		s1.setComposer("이민수 작곡");
		
		s2.setArtist("BIGBANG");
		s2.setTitle("거짓말");
		s2.setAlbum("Always");
		s2.setYear(2007);
		s2.setTrack("2번 track");
		s2.setComposer("G-DRAGON 작곡");
		
		s3.setArtist("버스커버스커");
		s3.setTitle("벚꽃엔딩");
		s3.setAlbum("버스커버스커 1집");
		s3.setYear(2012);
		s3.setTrack("4번 track");
		s3.setComposer("장범준 작곡");
		
		
		s1.showinfo();
		s2.showinfo();
		s3.showinfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
