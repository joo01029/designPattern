package com.company.chainOfResposibility;

public class Test {
	public static void main(String[] args) {
		Process process1 = new Process1(1);
		Process process2 = new Process2(process1,2);
		Process process3 = new Process3(process2,3);

		process3.process(1);
	}
}
