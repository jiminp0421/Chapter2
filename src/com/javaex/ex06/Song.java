package com.javaex.ex06;

public class Song {

	private String title, artist, album, composer, track;
	private int year;
	
	public Song( ) { //생성자
		
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear( ) {
		return year;
	}
	public String getTrack() {
		return track;
	}
	
	public void showinfo( ) {
		System.out.println(artist +", " + title + "(" + album + ", " + year + ", " + track +", " + composer + ")");
	}
	
	
}
