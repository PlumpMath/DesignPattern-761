package com.designPattern.Observer.impl;

import java.util.Observable;
import java.util.Observer;

/*
 * GG作为MM的观察者 实现了Oberver接口
 */
public class GG implements Observer {
	/*
	 * 覆写update方法 实现GG自己的业务方法
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable o, Object arg) {
		Event art = (Event)arg;
		
		System.out.println("MM有新情况了，快来看吧!");
		System.out.println("情况标题为：" + art.getTitle());
		System.out.println("情况内容为:" + art.getContent());
	}

}

