package com.designPattern.Singleton;
/*
 * GG单例模式的第三个版本 对函数进行同步
 */
public class GGVersionThree {
	//GG的姓名
	private String name;
	//对单例本身引用的名称
	private static GGVersionThree gGVersionThree;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//构造函数私有化
	private GGVersionThree() {
	}
	
	//提供一个全局的静态方法，使用同步方法
	public static synchronized GGVersionThree getGG() {
		if(gGVersionThree == null) {
			gGVersionThree = new GGVersionThree();
		}
		return gGVersionThree;
	}
}