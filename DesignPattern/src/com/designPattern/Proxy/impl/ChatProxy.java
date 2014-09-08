/**
 * 
 */
package com.designPattern.Proxy.impl;

import com.designPattern.Proxy.Chat;

/**
 * @author zibin 
 * 代理类，持有被代理类的一个引用
 */
public class ChatProxy implements Chat {

	private Chat myChat = new MyChat();

	public void reply(String message) {

		if (message.equals("hi,你好")) {
			System.out.println("hi, 你也好");
		} else if (message.equals("你从哪里来？")) {
			System.out.println("我来自中国！");
		} else if (message.equals("你多大了？")) {
			System.out.println("我今年22啦！");
		} else if (message.equals("身高多少呀？")) {
			System.out.println("我身高178cm");
		} else {
			myChat.reply(message);
		}
	}

}
