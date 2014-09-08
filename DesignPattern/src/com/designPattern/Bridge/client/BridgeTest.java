package com.designPattern.Bridge.client;

import com.designPattern.Bridge.Girl;
import com.designPattern.Bridge.SweetWord;
import com.designPattern.Bridge.impl.MM;
import com.designPattern.Bridge.impl.SweetWordFour;
import com.designPattern.Bridge.impl.SweetWordOne;
import com.designPattern.Bridge.impl.SweetWordThree;
import com.designPattern.Bridge.impl.SweetWordTwo;

public class BridgeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SweetWord sweetWordone  = new SweetWordOne();
		SweetWord sweetWordtwo = new SweetWordTwo();
		SweetWord sweetWordThree = new SweetWordThree();
		SweetWord sweetWordFour = new SweetWordFour();
		
		Girl girl = new MM(sweetWordone);
		girl.sayHi();
		Girl girl2 = new MM(sweetWordtwo);
		girl2.sayHi();
		Girl girl3 = new MM(sweetWordThree);
		girl3.sayHi();
		Girl girl4 = new MM(sweetWordFour);
		girl4.sayHi();

	}

}
