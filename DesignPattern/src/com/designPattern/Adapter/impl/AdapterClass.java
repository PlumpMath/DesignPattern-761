package com.designPattern.Adapter.impl;

public class AdapterClass extends Current{
	public void use18V() {
		System.out.println("������������");
		this.use220v();
	}
}
