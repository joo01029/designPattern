package com.company.memento_pattern;

public class Original {
	private String state;

	public String getState(){
		return state;
	}

	public Original(String state){
		this.state = state;
	}

	public Memento createMemento(){
		return new Memento(state);
	}

	public void restoreMemento(Memento memento){
		this.state = memento.getState();
	}
}
