package com.company.facade;

import com.company.facade.system.SystemController;

public class Test {
	public static void main(String[] args) {
		SystemController controller = new SystemController();
		controller.downVolume();
		System.out.println("볼륨 : "+controller.getVolume());
		controller.upVolume();
		System.out.println("볼륨 : "+controller.getVolume());

		controller.clearMemory();
	}
}
