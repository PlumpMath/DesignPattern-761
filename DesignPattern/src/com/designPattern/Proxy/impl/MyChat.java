/**
 * 
 */
package com.designPattern.Proxy.impl;

import com.designPattern.Proxy.Chat;

/**
 * @author zibin 
 * 具体角色类，被代理的类
 */
public class MyChat implements Chat {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designPattern.Proxy.Chat#reply(java.lang.String)
	 */
	@Override
	public void reply(String message) {
		System.out.println("需要我亲自回复的内容。。。");
	}

}
