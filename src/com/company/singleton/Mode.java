package com.company.singleton;

//싱글톤 패턴
public class Mode {
	private static Mode mode = null;
	private boolean blackMode = false;

	public String getModeType(){
		return blackMode ? "black mode" : "white Mode";
	}

	public void changeMode(){
		blackMode = !blackMode;
	}

	//생성 권한이 자기자신한테만 있음
	private Mode(){
	}

	//하나의 인스턴스만 만들어짐
	public static Mode getMode(){
		if(mode == null){
			mode = new Mode();
		}
		return mode;
	}

}
