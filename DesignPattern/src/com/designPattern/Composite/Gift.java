package com.designPattern.Composite;

import java.util.List;

public interface Gift {
	public void display();
	public boolean add(Gift file);
	public boolean remove(Gift file);
	public List<Gift> getChildren();
}
