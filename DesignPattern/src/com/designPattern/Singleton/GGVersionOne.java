package com.designPattern.Singleton;
/*
 * GG单例模式的第一个版本 为“饿汉式”
 */
public class GGVersionOne {
	//在类被加载进入内存的时候就创建单一的GG对象
	public static final GGVersionOne gGVersionOne = new GGVersionOne();
	//名称属性
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//构造函数私有化
	private GGVersionOne() {
	}
	
	//提供一个全局的静态方法
	public static GGVersionOne getGG() {
		return gGVersionOne;
	}
}