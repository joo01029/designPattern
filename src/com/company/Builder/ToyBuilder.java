package com.company.Builder;


//빌더
public class ToyBuilder {
	private Toy toy;
	public ToyBuilder(){
		toy = new Toy();
	}

	public ToyBuilder name(String name){
		toy.setName(name);
		return this;
	}

	public ToyBuilder price(Integer price){
		toy.setPrice(price);
		return this;
	}

	public ToyBuilder size(Integer size){
		toy.setSize(size);
		return this;
	}

	public ToyBuilder canSpeak(Boolean canSpeak){
		toy.setCanSpeak(canSpeak);
		return this;
	}

	public ToyBuilder useDryCell(Boolean useDryCell){
		toy.setUseDryCell(useDryCell);
		return this;
	}

	public Toy build(){
		return toy;
	}
}
