/**
 * 
 */
package com.designPattern.Facade.impl;

/**
 * @author zibin
 * 
 * ��۽ӿڣ���Ҫ���ṩ�ͻ���ʹ��ϵͳ����Ľӿڣ�������ϳ̶�
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
