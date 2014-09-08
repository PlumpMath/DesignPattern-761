package com.designPattern.Observer.Client;

import com.designPattern.Observer.impl.GG;
import com.designPattern.Observer.impl.MM;

/*
 * 观察者模式测试客户端
 */
public class ObserverTest {
	public static void main(String[] args) {
		MM user = new MM();
		user.addObserver(new GG());
		user.publishEvent("我有新情况啦", "Oh My God,我有新情况啦，Help！！！");
	}
}
