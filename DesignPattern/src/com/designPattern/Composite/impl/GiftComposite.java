package com.designPattern.Composite.impl;

import java.util.ArrayList;
import java.util.List;

import com.designPattern.Composite.Gift;

public class GiftComposite implements Gift {
	
	private List<Gift> children;
	
	private String name;

	public GiftComposite(String name) {
		this.name = name;
		children = new ArrayList<Gift>();
		
	}

	@Override
	public void display() {
		System.out.println(name);
	}

	@Override
	public boolean add(Gift file) {
		// TODO Auto-generated method stub
		return children.add(file);
	}

	@Override
	public boolean remove(Gift file) {
		
		return children.remove(file);
	}

	@Override
	public List<Gift> getChildren() {
		
		return children;
	}

}
