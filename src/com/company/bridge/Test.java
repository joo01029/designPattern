package com.company.bridge;

import com.company.bridge.mose.Mose;
import com.company.bridge.mose.SoundMose;
import com.company.bridge.mose.StringMose;

//브릿지 패턴
public class Test {
	public static void main(String[] args) {
		Mose mose = new StringMose();
		PrintMose print = new PrintMose();
		print.printS(mose);
		print.printO(mose);
		print.printS(mose);

		System.out.println();

		mose = new SoundMose();
		print.printS(mose);
		print.printO(mose);
		print.printS(mose);
	}

}
