/**
 * 
 */
package com.designPattern.Adapter.impl;

/**
 * @author zibin
 *对象适配器
 */
public class AdapterObject {
	/*
	 * 对源目标的引用
	 */
	private Current current;
	
	/*
	 * 在构造方法中实例化current
	 */
	public AdapterObject(Current current) {
		this.current = current;
	}
	/*
	 * 对象适配器提供的对客户端期望的接口
	 */
	public void use18V() {
		System.out.println("我是对象使用适配器");
		this.current.use220V();
	}
}
