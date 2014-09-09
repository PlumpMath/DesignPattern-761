package com.designPattern.Composite.client;

import java.util.*;

import com.designPattern.Composite.Gift;
import com.designPattern.Composite.impl.*;

public class CompositeTest {
	public static void main(String[] args) {
		//树枝组件节点
		Gift gift = new GiftComposite("大礼物");
		//树叶组件节点
		Gift shirt = new GiftLeaf("T恤");
		Gift skirt = new GiftLeaf("裙子");
		Gift bag = new GiftLeaf("包包");
		
		//把树叶节点加入到树枝节点中
		gift.add(shirt);
		gift.add(skirt);
		gift.add(bag);
		
		//调用树的遍历方法，来显示整棵树 	
		displayTree(gift,0);
		
	}
	
	public static void displayTree(Gift gift, int deep) {
		for(int i = 0; i < deep; i++) {
			System.out.print("--");
		}
		//显示自身的名称
		gift.display();
		//获得子树
		List<Gift> children = gift.getChildren();
		//遍历子树
		for(Gift file : children) {
			if(file instanceof GiftLeaf) {
				for(int i = 0; i <= deep; i++) {
					System.out.print("--");
				}
				file.display();
			} else {
				displayTree(file,deep + 1);
			}
		}
	}
}
