package com.company.decorator.drink;

import com.company.decorator.Drink;

public class Americano extends Drink {

	@Override
	public Integer getCost() {
		return 2000;
	}

	@Override
	public String getBeverage() {
		return "아메리카노";
	}

}
