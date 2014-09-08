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
		user.publishEvent("�ҿ�ʼ�仯��", "oh my god,�����������ˣ�");
	}

}
