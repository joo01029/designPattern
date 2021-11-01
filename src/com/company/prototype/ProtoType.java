package com.company.prototype;

public class ProtoType implements Cloneable{
	private String data;

	public String getData(){
		return data;
	}

	public void setData(String data){
		this.data = data;
	}

	public ProtoType copy() throws CloneNotSupportedException {
		return (ProtoType) this.clone();
	}
}
