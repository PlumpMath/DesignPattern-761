package com.designPattern.State.impl;

import com.designPattern.State.t.Time;

public class SevenOclock extends Time {

	@Override
	public void doSomething(MM mm) {
		if (mm.getHour() == 7) {
			System.out.println("���Ϻã��ó��緹��");
		} else {
			mm.setState(new TwelveOclock());
			mm.doSomething();
		}
	}

}
