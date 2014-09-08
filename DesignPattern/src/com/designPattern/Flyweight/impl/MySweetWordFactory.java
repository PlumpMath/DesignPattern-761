/**
 * 
 */
package com.designPattern.Flyweight.impl;

import java.util.HashMap;
import java.util.Map;

import com.designPattern.Flyweight.BaseSweetWord;

/**
 * @author zibin
 *
 */
public class MySweetWordFactory {

	private Map<String, BaseSweetWord> pool;
	/**
	 * 
	 */
	public MySweetWordFactory() {
		pool = new HashMap<String, BaseSweetWord>();
	}
	
	/**
	 * 这一段代码是关键，可以保证不会出现是重复的，从而为系统节省大量内存空间
	 */
	public BaseSweetWord getMyCharacter(String character){
		BaseSweetWord mychar = pool.get(character);
		if (mychar == null) {
			mychar = new MySweetWord(character);
			pool.put(character, mychar);
		}
		return mychar;
		
	}

}
