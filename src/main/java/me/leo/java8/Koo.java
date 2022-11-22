package me.leo.java8;

public interface Koo {
    // 해당 타입 관련 헬퍼 메소드 또는 유틸리티 메소드를 제공할 때 인터페이스에 static 메소드를 제공할 수 있다.
    static void printAnything() {
        System.out.println("Koo");
    }

    void printName();

    String getName();

    /**
     * @implSpec 이 구현체는 getName() 으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }
}
