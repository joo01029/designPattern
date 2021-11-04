package com.company.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	private String name;
	private List<Component> childs;

	public String getName(){
		return "folder : "+name;
	}

	public Composite(String name){
		super();
		this.name = name;
		this.childs = new ArrayList<Component>();
	}
	@Override
	public void task() {
		System.out.println("파일이 아님");
	}

	@Override
	public void add(Component component) {
		childs.add(component);
	}

	@Override
	public List<Component> getChild() {
		return childs;
	}
}
