package com.company.bridge.mose;

//모스부호를 부모로 가짐
public class StringMose implements Mose{
	@Override
	public void dot() {
		System.out.print(".");
	}

	@Override
	public void dash() {
		System.out.print("_");
	}

	@Override
	public void space() {
		System.out.print(" ");
	}
}
