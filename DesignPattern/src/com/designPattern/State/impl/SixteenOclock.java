package com.designPattern.State.impl;

import com.designPattern.State.t.Time;

public class SixteenOclock extends Time{

	@Override
	public void doSomething(MM mm) {
		if (mm.getHour() == 18) {
			System.out.println("����ã��ó�����");
		} else {
			mm.setState(new otherTime());
			mm.doSomething();
		}
	}

}
