/**
 * 
 */
package com.designPattern.Proxy.impl;

import com.designPattern.Proxy.Chat;

/**
 * @author zibin
 *
 */
public class MyChat implements Chat {

	/* (non-Javadoc)
	 * @see com.designPattern.Proxy.Chat#reply(java.lang.String)
	 */
	@Override
	public void reply(String message) {
		System.out.println("��Ҫ�����Իظ������ݡ�����");

	}

}
