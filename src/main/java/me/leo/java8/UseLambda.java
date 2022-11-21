package me.leo.java8;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class UseLambda {
    public static void main(String[] args) {
        UseLambda useLambda = new UseLambda();
        useLambda.run();
    }

    // 변수 캡처
    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // 람다 표현식
        IntConsumer intConsumer = (i) -> {
            System.out.println(i + baseNumber);
        };

        intConsumer.accept(10);
    }
}
