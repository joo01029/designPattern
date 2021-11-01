package com.company.abstractFactory.samsung;

import com.company.abstractFactory.Factory;
import com.company.abstractFactory.KeyBoard;
import com.company.abstractFactory.Mouse;

//공장을 상속
public class SamsungFactory implements Factory {
	@Override
	public Mouse makeMouse() {
		return new SamsungMouse();
	}

	@Override
	public KeyBoard makeKeyBoard() {
		return new SamsungKeyBoard();
	}
}
