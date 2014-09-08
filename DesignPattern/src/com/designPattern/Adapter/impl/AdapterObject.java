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
		System.out.println("���Ƕ���ʹ��������");
		this.current.use220v();
	}
}
