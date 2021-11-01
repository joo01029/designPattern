package com.company.Builder;


public class Toy {
	private String name;
	private Integer price;
	private Integer size;
	private Boolean canSpeak;
	private Boolean useDryCell;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void setCanSpeak(Boolean canSpeak) {
		this.canSpeak = canSpeak;
	}

	public void setUseDryCell(Boolean useDryCell) {
		this.useDryCell = useDryCell;
	}

	public int getSize() {
		return size;
	}

	public Boolean getCanSpeak() {
		return canSpeak;
	}

	public Boolean getUseDryCell() {
		return useDryCell;
	}

	public Integer getPrice() {
		return price;
	}
}
