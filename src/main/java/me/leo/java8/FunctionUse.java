package me.leo.java8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionUse {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (integer) -> integer + 10;

        Function<Integer, Integer> multiply2 = (integer) -> integer * 2;

        // compose : 들어온 인자 값을 multiply2 의 입력 값으로 사용하고 다시 나오는 값을 plus10 의 입력 값으로 사용
        Function<Integer, Integer> compose = plus10.compose(multiply2);
        System.out.println(compose.apply(2)); // (2*2) + 10 = 14

        // andThen : 들어온 인자 값을 plus10 의 입력 값으로 사용하고 다시 나오는 값을 multiply2 의 입력 값으로 사용
        Function<Integer, Integer> andThen = plus10.andThen(multiply2);
        System.out.println(andThen.apply(2)); // (2+10) * 2 = 24

        // 인자 값을 받아서 boolean 값을 리턴해준다.
        Predicate<String> startsWith = (s) -> s.startsWith("Leo");
        Predicate<Integer> isEven = (i) -> i%2 == 0;

        // 입력 값 하나를 받아서 동일한 타입을 리턴
        // 입출력 값이 같을 경우 Function 함수 대신 사용할 수 있다.
        UnaryOperator<Integer> plus20 = (integer -> integer + 20);


    }
}
