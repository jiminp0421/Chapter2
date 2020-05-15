package com.javaex.ex12;

public class TvApp {

	public static void main(String[] args) {
		
		Tv tv = new Tv(7,20,false);
		
		tv.status();
		System.out.println(tv.toString());
	
		tv.power(true);
		tv.volume(5);
		System.out.println(tv.toString());
		tv.status();
		
		tv.volume(false);
		System.out.println(tv.toString());
		tv.status();
		
		tv.channel(255);
		tv.status();
		System.out.println(tv.toString());
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		System.out.println(tv.toString());
		
		tv.power(false);
		tv.status();
		System.out.println(tv.toString());
		
		
	}

}
