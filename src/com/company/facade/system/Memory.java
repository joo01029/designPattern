package com.company.facade.system;

//다른 패키지에서 접근 불가능
class Memory {
	void checkMemory(){
		System.out.println("메모리 확인");
	}
	void clearMemory(){
		System.out.println("메모리 정리");
	}
}
