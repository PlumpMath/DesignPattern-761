/**
 * 
 */
package com.designPattern.Proxy.Client;

import com.designPattern.Proxy.Chat;
import com.designPattern.Proxy.impl.ChatProxy;


/**
 * @author zibin
 *
 */
public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Chat cp = new ChatProxy();
		cp.reply("���");
		cp.reply("���������");
		cp.reply("������");
		cp.reply("��߶���ѽ");
	}

}
