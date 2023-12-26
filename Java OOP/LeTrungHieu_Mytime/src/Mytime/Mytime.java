package Mytime;

import java.security.DrbgParameters.NextBytes;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class Mytime {
	private int hour ; 
	private int minute; 
	private int second; 
	
	public Mytime() {
		// TODO Auto-generated constructor stub
	}
	public Mytime(int hour, int minute, int second) {
		this.hour = hour; 
		this.minute = minute; 
		this.second = second; 
	}
	public boolean setTime(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
			this.hour = hour; 
			this.minute = minute; 
			this.second = second; 
			return true; 
		}else {
			System.out.println("Hour, Minute or Second is invalid!");
			return false; 
		}
	}
	public boolean setHour(int hour) {
		if(hour >= 0 && hour < 24 ) {
			this.hour = hour; 
			return true; 
		}else {
			return false; 
		}
	}
	public boolean setMinute(int minute) {
		if(minute >= 0 && minute < 60 ) {
			this.minute = minute; 
			return true; 
		}else {
			return false; 
		}
	}
	public boolean setSecond(int second) {
		if(second >= 0 && second < 60 ) {
			this.second = second; 
			return true; 
		}else {
			return false; 
		}
	}
	public int getHour() {
		return this.hour; 
	}
	public int getMinute() {
		return this.minute; 
	}
	public int getSecond() {
		return this.second; 
	}
	public String toString() {
		String result = String.format("Time: %02d:%02d:%02d", this.hour, this.minute, this.second);
		return result; 
	}
	public Mytime nextSecond () {
		if(this.second == 59) {
			this.second = 0; 
			if(this.minute == 59) {
				this.minute = 0; 
				if(this.hour == 23) {
					this.hour = 0; 
				}else {
					this.hour++; 
				}
			}else {
				this.minute++; 
			}
		}else {
			this.second++; 
		}
		int newHour = this.hour; 
		int newMinute = this.minute; 
		int newSecond = this.second; 
		return new Mytime(newHour, newMinute, newSecond); 
	}
	public Mytime previousSecond(){
		if(this.second == 0) {
			this.second = 59; 
			if(this.minute == 0) {
				this.minute = 59;
				if(this.hour == 0) {
					this.hour = 23; 
				}else {
					this.hour --; 
				}
			}else {
				this.minute --; 
			}
		}else {
			this.second --; 
		}
		int newHour = this.hour; 
		int newMinute = this.minute; 
		int newSecond = this.second; 
		return new Mytime(newHour, newMinute, newSecond); 
	}
	
	public Mytime nextMinute() {
		if(this.minute == 59) {
			this.minute = 0;
			if(this.hour == 23) {
				this.hour = 0; 
			}else {
				this.hour++; 
			}
		}else {
			this.minute++; 
		}
		int newHour = this.hour; 
		int newMinute = this.minute; 
		int newSecond = this.second; 
		return new Mytime(newHour, newMinute, newSecond); 
	}
	
	public Mytime previousMinute() {
		if(this.minute == 0) {
			this.minute = 59;
			if(this.hour == 0) {
				this.hour = 23; 
			}else {
				this.hour--; 
			}
		}else {
			this.minute--; 
		}
		int newHour = this.hour; 
		int newMinute = this.minute; 
		int newSecond = this.second; 
		return new Mytime(newHour, newMinute, newSecond); 
	}
	
	public Mytime nextHour() {
		if(this.hour == 23) {
			this.hour = 0; 
		}else {
			this.hour ++; 
		}
		int newHour = this.hour; 
		int newMinute = this.minute; 
		int newSecond = this.second; 
		return new Mytime(newHour, newMinute, newSecond); 
	}
	
	public Mytime previousHour() {
		if(this.hour == 0) {
			this.hour = 23; 
		}else {
			this.hour --; 
		}
		int newHour = this.hour; 
		int newMinute = this.minute; 
		int newSecond = this.second; 
		return new Mytime(newHour, newMinute, newSecond); 
	}
	
	
	
	
}
