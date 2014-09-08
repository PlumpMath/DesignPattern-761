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
		cp.reply("你好");
		cp.reply("你从哪里来");
		cp.reply("你多大了");
		cp.reply("身高多少呀");
	}

}
