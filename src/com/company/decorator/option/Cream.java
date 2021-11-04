package com.company.decorator.option;

import com.company.decorator.Drink;

public class Cream extends Option{
	public Cream(Drink drink){
		super(drink);
	}


	@Override
	public Integer getCost() {
		return drink.getCost() + 700;
	}

	@Override
	public String getBeverage() {
		return drink.getBeverage() + ", 크림";
	}
}
