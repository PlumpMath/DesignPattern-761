package com.designPattern.State.client;

import com.designPattern.State.impl.MM;

public class StateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MM mm = new MM();
		
		mm.setHour(7);
		mm.doSomething();
		
		mm.setHour(12);
		mm.doSomething();
		
		mm.setHour(18);
		mm.doSomething();
		
		mm.setHour(9);
		mm.doSomething();
		
		mm.setHour(7);
		mm.doSomething();
		
		mm.setHour(12);
		mm.doSomething();
		
		mm.setHour(15);
		mm.doSomething();
	}

}
