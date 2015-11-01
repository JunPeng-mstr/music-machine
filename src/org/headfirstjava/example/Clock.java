package org.headfirstjava.example;

import java.util.ArrayList;

public class Clock {
	String time;

	public void setTime(String t) {
		time = t;
	}

	public String getTime() {
		return time;
	}

//class ClockTestDrive {
	public static void main(String[] args) {
		
		Clock c = new Clock();
		
		c.setTime("1245");
		
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}
}