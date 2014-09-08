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
		if (message.equals("hi,���")) {
			System.out.println("��Ҳ��");
		} else if (message.equals("���������")) {
			System.out.println("�������й�");
		} else if (message.equals("�����ˣ�")) {
			System.out.println("�ҽ���22��");
		} else if (message.equals("��߶���ѽ")) {
			System.out.println("�����178cm");
		} else {
			myChat.reply(message);
		}

	}

}
