package com.designPattern.Observer.impl;

import java.util.Observable;

/*
 * MM作为被观察者 继承了Observable类
 */
public class MM extends Observable {
	
	public void publishEvent(String title,String cotent) {
		Event art = new Event();
		art.setTitle(title);
		art.setContent(cotent);
		System.out.println("MM有新情况了，标题:" + title + ",内容:" + cotent);
		this.setChanged();
		this.notifyObservers(art);
	}
}
