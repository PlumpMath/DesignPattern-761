/**
 * 
 */
package com.designPattern.Flyweight.client;

import com.designPattern.Flyweight.BaseSweetWord;
import com.designPattern.Flyweight.impl.MySweetWordFactory;

/**
 * @author zibin
 * 
 * ��Ԫģʽ��������ģʽ�ӹ���ģʽ
 *
 */
public class FlyweightTest {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MySweetWordFactory factory = new MySweetWordFactory();
		BaseSweetWord mychar1 = factory.getMyCharacter("niaho");
		BaseSweetWord mychar2 = factory.getMyCharacter("niqunali");
		BaseSweetWord mychar3 = factory.getMyCharacter("shide wodzai");
		BaseSweetWord mychar4 = factory.getMyCharacter("niaho");
		
		mychar1.display();
		mychar2.display();
		mychar3.display();
		mychar4.display();
		if (mychar1 == mychar4) {
			System.out.println("��ͬ��");
		}else
			System.out.println("different");
		
	}

}
