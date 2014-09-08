package com.designPattern.State.impl;

import com.designPattern.State.t.Time;


public class MM {
	
	private Integer hour;
	private Time time;
	
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public MM() {
		time = new SevenOclock();
	}
	
	public void doSomething(){
		time.doSomething(this);
		time = new SevenOclock();
	}
	
	public Time getState(){
		return time;
	}
	
	public void setState(Time time){
		this.time = time;
	}

}
