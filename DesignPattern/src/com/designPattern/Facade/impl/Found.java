/**
 * 
 */
package com.designPattern.Facade.impl;

/**
 * @author zibin
 * 
 * 外观接口，主要是提供客户端使用系统子类的接口，减少耦合程度
 *
 */
public class Found {
	
	private Strock strock;
	
	private NationalDebt nationalDebt;
	
	private Futures futures;
	
	public Found() {
		this.futures = new Futures();
		this.nationalDebt = new NationalDebt();
		this.strock = new Strock();
	}
	
	public void fundA(){
		this.nationalDebt.buy();
		this.futures.buy();
		
	}
	public void fundB(){
		this.nationalDebt.buy();
		this.strock.buy();
		
	}
	public void fundC(){
		this.futures.buy();
		this.strock.buy();
	}
	public void fundD(){
		this.futures.buy();
		this.strock.buy();
		this.nationalDebt.buy();
	}

}
