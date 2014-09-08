package com.designPattern.Observer.impl;

import java.util.Observable;
import java.util.Observer;

public class GG implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		Event art = (Event)arg1;
		System.out.println("MM 有新情况了，快来看吧！");
		System.out.println("情况标题为："+ art.getTitle());
		System.out.println("情况内容为："+art.getContent() );
	}

}
