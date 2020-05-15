package com.javaex.ex12;

public class Tv {
	
	private int channel, volume;
	private boolean power;
	
	
	
	public Tv() {
	} //생성자
	
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	//gett
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	
	public void power(boolean on) {
		power = on;
	}
	public void channel(int channel) {
		this.channel = channel;
	}
	public void channel(boolean up) {
		if(up==true) {
			channel ++;
			if(channel>=255) {
				channel=255;}
		}else {
			channel --;
		}
	}
	public void volume(int volume) {
		this.volume = volume;
	}
	public void volume(boolean up) {
		if(up==true) {
			volume++;
			if(volume >100) {
				this.volume = 100;
			}
		}else {
			volume --;
			if(volume < 0) {
				this.volume = 0;
			}
		}
	}
		
	
		
	public void status() {
		System.out.println();
	}


	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
}
