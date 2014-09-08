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
	 * ��һ�δ����ǹؼ������Ա�֤����������ظ��ģ��Ӷ�Ϊϵͳ��ʡ�����ڴ�ռ�
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
