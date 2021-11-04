package com.company.decorator.option;

import com.company.decorator.Drink;

//Drink를 상속 받는 optiopn
public abstract class Option extends Drink {
	protected Drink drink;

	public Option(Drink drink){
		this.drink = drink;
	}
}
