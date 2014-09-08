package com.designPattern.Observer.impl;

import java.util.Observable;

public class MM extends Observable {
	public void publishEvent(String title,String content){
		Event art = new Event();
		art.setTitle(title);
		art.setContent(content);
		System.out.println("MM��������ˣ����⣺"+title+"�����ݣ�"+content);
		this.setChanged();
		this.notifyObservers(art);
	}
	

}
