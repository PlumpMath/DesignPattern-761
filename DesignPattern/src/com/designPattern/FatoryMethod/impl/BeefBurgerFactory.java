package com.designPattern.FatoryMethod.impl;
import com.designPattern.FatoryMethod.Food;
import com.designPattern.FatoryMethod.FoodFactory;

/*
 *牛肉汉堡工厂
 */
public class BeefBurgerFactory implements FoodFactory {
	/*
	 * 生产出一份牛肉汉堡
	 * @see com.designPattern.FatoryMethod.FoodFactory#getFood()
	 */
	public Food getFood() {
		return new BeefBurger();
	}

}

