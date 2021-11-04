package com.company.decorator.option;

import com.company.decorator.Drink;

public class Shot extends Option{
	public Shot(Drink drink){
		super(drink);
	}


	@Override
	public Integer getCost() {
		return drink.getCost() + 500;
	}

	@Override
	public String getBeverage() {
		return drink.getBeverage() + ", 샷";
	}
}
