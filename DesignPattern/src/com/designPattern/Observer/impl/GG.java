package com.designPattern.Observer.impl;

import java.util.Observable;
import java.util.Observer;

public class GG implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		Event art = (Event)arg1;
		System.out.println("MM ��������ˣ��������ɣ�");
		System.out.println("�������Ϊ��"+ art.getTitle());
		System.out.println("�������Ϊ��"+art.getContent() );
	}

}
