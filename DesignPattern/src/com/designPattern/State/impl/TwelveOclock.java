package com.designPattern.State.impl;

import com.designPattern.State.t.Time;

public class TwelveOclock extends Time {

	@Override
	public void doSomething(MM mm) {
		if (mm.getHour() == 12) {
			System.out.println("����ã��ó��緹��");
			
		} else {
			mm.setState(new SixteenOclock());
			mm.doSomething();
		}
	}

}
