/**
 * 
 */
package com.designPattern.Flyweight.impl;

import com.designPattern.Flyweight.BaseSweetWord;

/**
 * @author zibin ������Ԫ��
 * 
 */
public class MySweetWord implements BaseSweetWord {
	/**
	 * ������Ԫ����
	 * 
	 */
	private String mychar;

	/**
	 * 
	 */
	public MySweetWord() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public MySweetWord(String mychar) {
		this.mychar = mychar;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designPattern.Flyweight.BaseSweetWord#display()
	 */
	@Override
	public void display() {
		System.out.println(mychar);

	}

}
