package com.designPattern.Bridge.impl;

import com.designPattern.Bridge.SweetWord;

public class SweetWordThree implements SweetWord {

	@Override
	public void praise() {
		System.out.println("你的新发型好漂亮");
	}

}
