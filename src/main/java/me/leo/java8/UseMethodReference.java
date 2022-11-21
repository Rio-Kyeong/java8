package me.leo.java8;

import java.util.Arrays;
import java.util.function.*;

public class UseMethodReference {
	public static void main(String[] args) {
		// static method reference 사용
		// UnaryOperator<String> hi = (s) -> "hi "+ s;
		UnaryOperator<String> hi = Greeting::hi;

		Function<String, Greeting> createGreeting = Greeting::createGreeting;
		Greeting staticGreeting = createGreeting.apply("static");

		// instance method reference 사용
		Greeting greeting = new Greeting();
		UnaryOperator<String> hello = greeting::hello;
		Supplier<String> name = greeting::getName;

		// instance 생성
		// 기본 생성자를 참조
		Supplier<Greeting> basicGreeting = Greeting::new;
		Greeting getGreeting = basicGreeting.get();

		// instance 생성
		// String name 을 파라미터로 가지고 있는 생성자를 참조
		Function<String, Greeting> leoGreeting = Greeting::new;
		Greeting leo = leoGreeting.apply("leo");

		// 특정 객체의 인스턴스 메소드 참조
		String[] names = {"keesun", "whiteship", "toby"};
		Arrays.sort(names, String::compareToIgnoreCase);

		// 받은 값 출력
		Consumer<String> printName1 = (n) -> System.out.println(n);
		Consumer<String> printName2 = System.out::println;

		// 문자열 수 반환
		Function<String, Integer> lengthStr1 = (string) -> string.length();
		Function<String, Integer> lengthStr2 = String::length;

		// 문자열 비교
		BiFunction<String, String, Boolean> equalCheck1 = (str1, str2) -> str1.equals(str2);
		BiFunction<String, String, Boolean> equalCheck2 = Object::equals;

		// 숫자 비교(큰 수 반환)
		BinaryOperator<Integer> maxNum1 = (num1, num2) -> Math.max(num1, num2);
		BinaryOperator<Integer> maxNum2 = Math::max;
	}
}
