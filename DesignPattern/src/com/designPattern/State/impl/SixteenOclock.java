package com.designPattern.State.impl;

import com.designPattern.State.t.Time;

public class SixteenOclock extends Time{

	@Override
	public void doSomething(MM mm) {
		if (mm.getHour() == 18) {
			System.out.println("下午好，该吃晚饭了");
		} else {
			mm.setState(new otherTime());
			mm.doSomething();
		}
	}

}
