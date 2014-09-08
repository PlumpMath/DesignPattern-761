/**
 * 
 */
package com.designPattern.Bridge.impl;

import com.designPattern.Bridge.Girl;
import com.designPattern.Bridge.SweetWord;

/**
 * @author zibin
 *
 */
public class MM extends Girl {

	/**
	 * @param sweetWord
	 */
	public MM(SweetWord sweetWord) {
		super(sweetWord);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHi() {
		this.getSweetWord().praise();
		
	}

}
