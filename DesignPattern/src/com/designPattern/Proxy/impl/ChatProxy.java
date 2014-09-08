/**
 * 
 */
package com.designPattern.Proxy.impl;

import com.designPattern.Proxy.Chat;

/**
 * @author zibin
 * 
 */
public class ChatProxy implements Chat {

	private MyChat myChat = new MyChat();

	@Override
	public void reply(String message) {
		if (message.equals("hi,你好")) {
			System.out.println("你也好");
		} else if (message.equals("你从哪里来")) {
			System.out.println("我来自中国");
		} else if (message.equals("你多大了？")) {
			System.out.println("我今年22啦");
		} else if (message.equals("身高多少呀")) {
			System.out.println("我身高178cm");
		} else {
			myChat.reply(message);
		}

	}

}
