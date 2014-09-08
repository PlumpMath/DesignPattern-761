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
	/**
	 * 
	 */
	public GiftLeaf(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.designPattern.Composite.Gift#display()
	 */
	@Override
	public void display() {
		System.out.println(name);
	}

	/* (non-Javadoc)
	 * @see com.designPattern.Composite.Gift#add(com.designPattern.Composite.Gift)
	 */
	@Override
	public boolean add(Gift file) {
		
		return false;
	}

	/* (non-Javadoc)
	 * @see com.designPattern.Composite.Gift#remove(com.designPattern.Composite.Gift)
	 */
	@Override
	public boolean remove(Gift file) {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.designPattern.Composite.Gift#getChildren()
	 */
	@Override
	public List<Gift> getChildren() {
		return null;
	}

}
