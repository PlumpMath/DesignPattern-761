package com.designPattern.Adapter.client;

import com.designPattern.Adapter.impl.AdapterObject;
import com.designPattern.Adapter.impl.Current;

public class AdapterObjectTesr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdapterObject aObject = new AdapterObject(new Current());
		aObject.use18V();

	}

}
