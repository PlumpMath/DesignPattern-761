package com.designPattern.Singleton;
/*
 * GG单例模式的第二个版本 采用“懒汉式” 在需要使用的时候才实例化GG
 */
public class GGVersionTwo {
	//GG的姓名
	private String name;
	//对单例本身引用的名称
	private static GGVersionTwo gGVersionTwo;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//构造函数私有化
	private GGVersionTwo() {
	}
	
	//提供一个全局的静态方法
	public static GGVersionTwo getGG() {
		if(gGVersionTwo == null) {
			gGVersionTwo = new GGVersionTwo();
		}
		return gGVersionTwo;
	}
}