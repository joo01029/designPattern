package com.company.composite;

import java.util.ArrayList;
import java.util.List;

public class Leaf extends Component{
	private String name;
	public Leaf(String name){
		this.name = name;
	}
	public String getName(){
		return "file : "+name;
	}
	@Override
	public void task() {
		System.out.println("파일 수행");
	}

	@Override
	public void add(Component component) {
		System.out.println("추가 불가능");
	}

	@Override
	public List<Component> getChild() {
		System.out.println("자식을 가질 수 없음");
		return new ArrayList<>();
	}
}
