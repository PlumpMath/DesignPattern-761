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

	public static void main(String[] args) {
		//直接调用代理类
		Chat cp = new ChatProxy();
		
        //代理类提供的实现
		cp.reply("hi,你好");
		cp.reply("你从哪里来？");
		cp.reply("你多大了？");
		cp.reply("身高多少呀？");
        
		//具体类提供的实现
		cp.reply("你喜欢我吗？");
	}
}