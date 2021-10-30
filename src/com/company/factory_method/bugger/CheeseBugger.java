package com.company.factory_method.bugger;

//bugger라는 부모를 상속
public class CheeseBugger implements Bugger{
	private int price = 4000;

	@Override
	public int getPrice(){
		return price;
	}
}
