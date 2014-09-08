package com.designPattern.Observer.Client;

import com.designPattern.Observer.impl.GG;
import com.designPattern.Observer.impl.MM;

public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MM user = new MM();
		user.addObserver(new GG());
		user.publishEvent("我开始变化了", "oh my god,真的有新情况了！");
	}

}
