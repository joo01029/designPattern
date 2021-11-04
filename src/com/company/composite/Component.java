package com.company.composite;

import java.util.List;

public abstract class Component {
	abstract void task();
	abstract void add(Component component);
	abstract String getName();
	public static void remove(Component component) {
		component = null;
	}
	abstract List<Component> getChild();
}
