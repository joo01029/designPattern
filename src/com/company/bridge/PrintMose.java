package com.company.bridge;

import com.company.bridge.mose.Mose;

//알파벳 매칭
public class PrintMose {
	public void printS(Mose mose){
		mose.dot();
		mose.dot();
		mose.dot();
		mose.space();
	}
	public void printO(Mose mose){
		mose.dash();
		mose.dash();
		mose.dash();
		mose.space();
	}
}
