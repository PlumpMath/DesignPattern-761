/**
 * 
 */
package com.designPattern.Facade.client;

import com.designPattern.Facade.impl.Found;

/**
 * @author zibin
 * 测试外观模式
 * 
 * 外观模式本质是减少客户端与系统子类直接的相关性，从而将系统子类的方法封装在另外一个接口上，这样的话，即使子类属性或者方法有改变也不会直接
 * 对客户端产生影响。
 * 
 * 优点：外观模式就是提供一个统一的接口。当然客户端也可以绕过这个接口直接调用子类的接口，所以外观模式对于外部系统使用子类的时候比较灵活。
 * 
 * 缺点：外观模式提供统一接口的时候数量时有限的！
 *
 */
public class FacdeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//建立基金类
		Found jijin = new Found();		
		jijin.fundA();
	}

}
