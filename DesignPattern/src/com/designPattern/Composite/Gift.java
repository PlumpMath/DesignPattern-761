package com.designPattern.Composite;

import java.util.List;
/*
 * 礼物节点的抽象
 */
public interface Gift {
	
	//显示礼物的树枝角色或者树叶角色的名称
	public void display();
	
	//添加
	public boolean add(Gift file);
	
	//移除
	public boolean remove(Gift file);
	
	//获得子节点
	public List<Gift> getChildren();
}