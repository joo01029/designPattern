package com.company.composite;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		Component root = new Composite("root");
		Component file1 = new Leaf("file1");
		Component document = new Composite("document");
		Component file2 = new Leaf("file2");
		Component file3 = new Leaf("file3");
		root.add(file1);
		root.add(document);

		document.add(file3);
		document.add(file2);

		test.search(root);
	}

	private void search(Component component){
		System.out.println(component.getName());
		component.getChild().stream()
				.forEach((child)->{
					search(child);
				});
	}
}
