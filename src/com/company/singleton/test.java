package com.company.singleton;

public class test {
	public static void main(String[] args) {

		Mode mode1 = Mode.getMode();
		Mode mode2 = Mode.getMode();

		System.out.println(mode1.getModeType());
		System.out.println(mode2.getModeType());

		mode1.changeMode();
		//같은 값 출력
		System.out.println(mode1.getModeType());
		System.out.println(mode2.getModeType());
	}
}
