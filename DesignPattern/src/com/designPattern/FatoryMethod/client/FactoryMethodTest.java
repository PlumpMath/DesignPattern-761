package com.designPattern.FatoryMethod.client;
import com.designPattern.FatoryMethod.Food;
import com.designPattern.FatoryMethod.FoodFactory;
import com.designPattern.FatoryMethod.impl.BeefBurgerFactory;
import com.designPattern.FatoryMethod.impl.ChickenBurgerFactory;


/*
 * 测试客户端
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		//获得ChickenBurgerFactory
		FoodFactory chickenBurgerFactory = new ChickenBurgerFactory();
		
		//通过ChickenBurgerFactory来获得ChickenBurger实例对象
		Food ChickenBurger = chickenBurgerFactory.getFood();
		ChickenBurger.get();
		
		
		//获得BeefBurgerFactory
		FoodFactory beefBurgerFactory = new BeefBurgerFactory();
		
		//通过BeefBurgerFactory来获得BeefBurger实例对象
		Food beefBurger = beefBurgerFactory.getFood();
		beefBurger.get();
		
	}
}
