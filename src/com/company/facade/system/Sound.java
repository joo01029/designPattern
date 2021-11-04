package com.company.facade.system;

//다른 패키지에서 접근 불가능
class Sound {
	private Integer volume;
	Integer getVolume(){
		return volume;
	}

	void setVolume(Integer volume){
		if(volume > 10 || volume < 0){
			System.out.println("범위를 넘어갔습니다.");
			return;
		}
		this.volume = volume;
	}

	Sound (){
		volume = 0;
	}
}
