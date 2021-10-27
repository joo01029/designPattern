package com.company.template;


public class TemplatePattern {
	public void no_template_pattern(){
		System.out.println("로직 1");
		System.out.println("로직 1");
		System.out.println("로직 1");

		System.out.println("로직 2");
		System.out.println("로직 2");
		System.out.println("로직 2");

		System.out.println("로직 3");
		System.out.println("로직 3");
		System.out.println("로직 3");
	}
	//하나의 알고리즘을 여러 과정으로 분리
	public void template_pattern(){
		logic1();
		logic2();
		logic3();
	}
	//과정1
	private void logic1(){
		System.out.println("로직 1");
		System.out.println("로직 1");
		System.out.println("로직 1");
	}
	//과정2
	private void logic2(){
		System.out.println("로직 2");
		System.out.println("로직 2");
		System.out.println("로직 2");
	}
	//과정3
	private void logic3(){
		System.out.println("로직 3");
		System.out.println("로직 3");
		System.out.println("로직 3");
	}

	public static void main(String[] args) {
		TemplatePattern templatePattern = new TemplatePattern();

		templatePattern.no_template_pattern();
		templatePattern.template_pattern();
	}
}
