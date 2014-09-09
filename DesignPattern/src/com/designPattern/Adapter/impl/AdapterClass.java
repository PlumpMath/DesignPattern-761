package com.designPattern.Adapter.impl;

/**
 * @author zibin
 * 类适配器 使用了继承的方式
 */
public class AdapterClass extends Current{
	/*
	 * 客户端期望的接口
	 */
	public void use18V() {
		System.out.println("我是类适配器");
		//调用Current的方法
		this.use220V();
	}
}
