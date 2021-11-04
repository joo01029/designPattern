package com.company.decorator;

import com.company.decorator.drink.Americano;
import com.company.decorator.drink.Latte;
import com.company.decorator.option.Cream;
import com.company.decorator.option.Shot;

public class Test {
	public static void main(String[] args) {
		Drink americano = new Americano();
		Drink americanoAddedShot = new Shot(americano);

		Drink latte = new Latte();
		Drink latteAddedShot = new Shot(latte);
		Drink latteAddedCream = new Cream(latteAddedShot);

		System.out.println(americanoAddedShot.getBeverage() + " " + americanoAddedShot.getCost());
		System.out.println(latteAddedCream.getBeverage() + " " + latteAddedCream.getCost());
	}
}
