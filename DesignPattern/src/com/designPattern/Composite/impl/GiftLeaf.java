/**
 * 
 */
package com.designPattern.Composite.impl;

import java.util.List;

import com.designPattern.Composite.Gift;

/**
 * @author zibin
 * 
 */

public class GiftLeaf implements Gift {
	private String name;

	public GiftLeaf(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(name);
	}

	public List<Gift> getChildren() {
		return null;
	}

	public boolean add(Gift file) {
		return false;
	}

	public boolean remove(Gift file) {
		return false;
	}

}
