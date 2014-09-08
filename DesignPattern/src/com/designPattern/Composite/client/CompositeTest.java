package com.designPattern.Composite.client;

import java.util.*;

import com.designPattern.Composite.Gift;
import com.designPattern.Composite.impl.*;

public class CompositeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gift gift = new GiftComposite("������");
		
		Gift shirt = new GiftLeaf("T��");
		Gift skirt = new GiftLeaf("ȹ��");
		Gift bag = new GiftLeaf("����");
		
		gift.add(shirt);
		gift.add(skirt);
		gift.add(bag);
		
		displayTree(gift, 0);
		
	}

	
	public static void displayTree(Gift gift,int deep){
		for(int i = 0;i < deep;i++){
			System.out.println("--");
		}
		gift.display();
		List<Gift> children = gift.getChildren();
		for(Gift file : children){
			if (file instanceof GiftLeaf) {
				for(int i = 0;i<=deep;i++){
					System.out.print("--");
				}
				file.display();
			} else {
				displayTree(file, deep + 1);
			}
		}
	}
}
