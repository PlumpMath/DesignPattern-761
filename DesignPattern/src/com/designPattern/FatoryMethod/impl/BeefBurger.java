package com.designPattern.FatoryMethod.impl;
import com.designPattern.FatoryMethod.Food;

/*
 * 牛肉汉堡
 */
public class BeefBurger implements Food{
	/*
	 * 获取牛肉汉堡
	 */
	public void get(){
		System.out.println("获得一份牛肉汉堡");
	}
}
