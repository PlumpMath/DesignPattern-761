package com.designPattern.FatoryMethod.impl;
import com.designPattern.FatoryMethod.Food;
import com.designPattern.FatoryMethod.FoodFactory;

/*
 * 肌肉汉堡工厂
 */
public class ChickenBurgerFactory implements FoodFactory {
	/*
	 * 生产出一份肌肉汉堡
	 * @see com.diermeng.designPattern.FatoryMethod.FoodFactory#getFood()
	 */
	public Food getFood() {
		return new ChickenBurger();
	}

}

