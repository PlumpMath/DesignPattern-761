package com.designPattern.Composite.impl;

import java.util.ArrayList;
import java.util.List;

import com.designPattern.Composite.Gift;
/*
 * 礼物的树枝节点 实现了礼物的抽象节点
 */
public class GiftComposite implements Gift{
	/*
	 * 礼物树枝节点的名称属性
	 */
	private String name;
	/*
	 * 礼物树枝节点的子节点
	 */
	private List<Gift> children;
	
	public GiftComposite(String name) {
		this.name = name;
		children = new ArrayList<Gift>();
	}
	

	public void display() {
		System.out.println(name);
	}

	public List<Gift> getChildren() {
		return children;
	}


	public boolean add(Gift file) {
		return children.add(file);
	}


	public boolean remove(Gift file) {
		return children.remove(file);
	}


}
