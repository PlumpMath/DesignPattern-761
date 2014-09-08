package com.designPattern.State.impl;

import com.designPattern.State.t.Time;

public class SevenOclock extends Time {

	@Override
	public void doSomething(MM mm) {
		if (mm.getHour() == 7) {
			System.out.println("早上好，该吃早饭了");
		} else {
			mm.setState(new TwelveOclock());
			mm.doSomething();
		}
	}

}
