/**
 * 
 */
package com.designPattern.Flyweight.impl;

import com.designPattern.Flyweight.BaseSweetWord;

/**
 * @author zibin 具体享元类
 * 
 */
public class MySweetWord implements BaseSweetWord {
	/**
	 * 具体享元属性
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
