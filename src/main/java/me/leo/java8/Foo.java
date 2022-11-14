package me.leo.java8;

public class Foo {
	public static void main(String[] args) {
		// 익명 내부 클래스: anonymous inner class
		RunSomething runSomething = new RunSomething() {
			@Override
			public void doIt() {
				System.out.println("Hello");
			}
		};

		// 람다 표현식
		RunSomething runSomethingLambda = () -> System.out.println("Hello");
		runSomethingLambda.doIt();
	}
}
