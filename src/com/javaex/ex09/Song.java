package com.javaex.ex09;

public class Song {

		private String artist, album, composer, track, title;
		private int year;
		
		//생성자
		
		public Song( ) {}
		
		public Song(String artist, String album, String composer, String track, String title, int year) {
			this.artist = artist;
			this.album = album;
			this.composer = composer;
			this.track = track;
			this.title = title;
			this.year = year;
		}
		

		//g/s
		
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public String getComposer() {
			return composer;
		}
		public void setComposer(String composer) {
			this.composer = composer;
		}
		public String getTrack() {
			return track;
		}
		public void setTrack(String track) {
			this.track = track;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		
		//일반메소드
		
		public void showinfo( ) {
			System.out.println(artist +", " + title + "(" + album + ", " + year + ", " + track +", " + composer + ")");
			}
		
		
		//showInfo
		@Override
		public String toString() {
			return "Song [artist=" + artist + ", album=" + album + ", composer=" + composer + ", track=" + track
			+ ", title=" + title + ", year=" + year + "]";
		}
		
		
		
	}


