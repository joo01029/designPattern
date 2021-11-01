package com.company.abstractFactory;

import com.company.abstractFactory.LG.LgFactory;
import com.company.abstractFactory.samsung.SamsungFactory;

public class Test {
	public static void main(String[] args) {

		Factory samsung = new SamsungFactory();
		Factory lg = new LgFactory();

		//각자 자신과 관련된 객체만 생성 가능
		Mouse samsungMouse = samsung.makeMouse();
		Mouse lgMouse = lg.makeMouse();
		System.out.println(samsungMouse.getPrice());
		System.out.println(lgMouse.getPrice());

		KeyBoard samsungKeyBoard = samsung.makeKeyBoard();
		KeyBoard lgKeyBoard = lg.makeKeyBoard();
		System.out.println(samsungKeyBoard.getPrice());
		System.out.println(lgKeyBoard.getPrice());
	}
}
