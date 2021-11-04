package com.company.decorator.drink;

import com.company.decorator.Drink;

public class Latte extends Drink {

	@Override
	public Integer getCost() {
		return 3000;
	}

	@Override
	public String getBeverage() {
		return "라떼";
	}
}
