package com.company.abstractFactory.LG;

import com.company.abstractFactory.Factory;
import com.company.abstractFactory.KeyBoard;
import com.company.abstractFactory.Mouse;

//공장을 상속
public class LgFactory implements Factory {
	@Override
	public Mouse makeMouse() {
		return new LgMouse();
	}

	@Override
	public KeyBoard makeKeyBoard() {
		return new LgKeyBoard();
	}
}
