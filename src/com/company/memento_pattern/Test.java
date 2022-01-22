package com.company.memento_pattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Memento> mementos = new ArrayList<>();

		Original person = new Original("기쁨");
		mementos.add(person.createMemento());

		person = new Original("슬픔");
		mementos.add(person.createMemento());

		person = new Original("화남");
		mementos.add(person.createMemento());

		person.restoreMemento(mementos.get(0));

		System.out.println(person.getState());

	}
}
