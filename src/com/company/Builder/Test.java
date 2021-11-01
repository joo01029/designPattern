package com.company.Builder;

public class Test {
	public static void main(String[] args) {
		ToyBuilder builder = new ToyBuilder();
		Toy toy = builder.name("아이폰")
				.price(900000)
				.size(18)
				.canSpeak(true)
				.useDryCell(true)
				.build();


		System.out.println(toy.getName());
		System.out.println(toy.getPrice());
		System.out.println(toy.getSize());
		System.out.println(toy.getUseDryCell());
		System.out.println(toy.getCanSpeak());
	}
}
