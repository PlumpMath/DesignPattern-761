package com.designPattern.State.impl;

import com.designPattern.State.t.Time;

public class otherTime extends Time {

	@Override
	public void doSomething(MM mm) {
		System.out.println("������"+mm.getHour()+"�㡣"+"�����������޷�Ԥ�����죬��������Ҫ�ڽ���ú��మ��");
	}

}
