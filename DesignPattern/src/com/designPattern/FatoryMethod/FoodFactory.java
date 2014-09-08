package com.designPattern.FatoryMethod;

/*
 * 食物的生产工厂的抽象接口
 */
public interface FoodFactory {
	/*
	 * 生产工厂生产出相应的食物
	 */
	public Food getFood();
}