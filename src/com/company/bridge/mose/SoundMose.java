package com.company.bridge.mose;


//모스부호를 부모로 가짐
public class SoundMose implements Mose{
	@Override
	public void dot() {
		System.out.print("따");
	}

	@Override
	public void dash() {
		System.out.print("따~~");
	}

	@Override
	public void space() {
		System.out.print(" ");
	}
}
