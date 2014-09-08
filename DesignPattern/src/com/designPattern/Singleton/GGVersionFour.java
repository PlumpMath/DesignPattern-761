package com.designPattern.Singleton;
/*
 * GG单例模式的第四个版本，既解决了“懒汉式的”多线程问题，又解决了资源浪费的现象，看上去是一种不错的选择
 */
public class GGVersionFour {
	//GG的姓名
	private String name;
	//对单例本身引用的名称
	private static GGVersionFour gGVersionFour;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//构造函数私有化
	private GGVersionFour() {
	}
	
	//提供一个全局的静态方法
	public static GGVersionFour getGG() {
		if(gGVersionFour == null) {
			synchronized (GGVersionFour.class) {
				if(gGVersionFour == null) {
					gGVersionFour = new GGVersionFour();
				}
			}
			
		}
		return gGVersionFour;
	}
}
