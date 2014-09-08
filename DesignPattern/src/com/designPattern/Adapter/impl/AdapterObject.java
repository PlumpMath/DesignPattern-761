/**
 * 
 */
package com.designPattern.Adapter.impl;

/**
 * @author zibin
 *
 */
public class AdapterObject {
	private Current current;
	
	public AdapterObject(Current current) {
		this.current = current;
	}
	
	public void use18v(){
		System.out.println("我是对象使用适配器");
		this.current.use220v();
	}
}
