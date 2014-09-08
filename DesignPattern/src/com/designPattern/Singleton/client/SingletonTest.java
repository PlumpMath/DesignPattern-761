package com.designPattern.Singleton.client;
import com.designPattern.Singleton.GGVersionFour;

/*
 * 测试客户端
 */
public class SingletonTest {
	public static void main(String[] args) {
		//实例化
		GGVersionFour gG1 = GGVersionFour.getGG();
		GGVersionFour gG2 = GGVersionFour.getGG();
		//设值
		gG1.setName("GGAlias");
		gG2.setName("GG");
		
		System.out.println(gG1.getName());
		System.out.println(gG2.getName());
		
		
	}
}
