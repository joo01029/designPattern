package com.company.factory_method.bugger;

//bugger라는 부모를 상속
public class ChickenBugger implements Bugger{
	private int price = 4500;

	@Override
	public int getPrice(){
		return price;
	}
}
