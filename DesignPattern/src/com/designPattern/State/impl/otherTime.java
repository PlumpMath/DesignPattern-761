package com.designPattern.State.impl;

import com.designPattern.State.t.Time;

public class otherTime extends Time {

	@Override
	public void doSomething(MM mm) {
		System.out.println("现在是"+mm.getHour()+"点。"+"现在是我们无法预测明天，所以我们要在今天好好相爱。");
	}

}
