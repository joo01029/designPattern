package com.company.facade.system;

public class SystemController {
	private static Memory memory;
	private static Sound sound;

	public void clearMemory(){
		memory.checkMemory();
		memory.clearMemory();
	}

	public void upVolume(){
		Integer volume = sound.getVolume();
		sound.setVolume(volume + 1);
	}
	public void downVolume(){
		Integer volume = sound.getVolume();
		sound.setVolume(volume - 1);
	}

	public Integer getVolume(){
		return sound.getVolume();
	}

	public SystemController() {
		if(memory == null){
			memory = new Memory();
		}
		if(sound == null){
			sound = new Sound();
		}
	}
}
