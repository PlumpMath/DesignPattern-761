package com.designPattern.State.impl;

import com.designPattern.State.t.Time;

public class TwelveOclock extends Time {

	@Override
	public void doSomething(MM mm) {
		if (mm.getHour() == 12) {
			System.out.println("中午好，该吃午饭了");
			
		} else {
			mm.setState(new SixteenOclock());
			mm.doSomething();
		}
	}

}
