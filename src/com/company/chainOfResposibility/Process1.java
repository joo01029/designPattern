package com.company.chainOfResposibility;

public class Process1 implements Process{
	private Process nextProcess;
	private Integer canDoTaskNumber;
	@Override
	public void process(int i) {
		if(i == 1){
			System.out.println("1번 프로세세에서 처리");
		}else if(nextProcess != null){
			System.out.println("다음 프로세서로 넘김");
			nextProcess.process(i);
		}else{
			System.out.println("프로세스 끝");
		}
	}

	public Process1(Process process, Integer canDoTaskNumber){
		this.nextProcess = process;
		this.canDoTaskNumber = canDoTaskNumber;
	}

	public Process1(Integer canDoTaskNumber){
		this.canDoTaskNumber = canDoTaskNumber;
	}
}
