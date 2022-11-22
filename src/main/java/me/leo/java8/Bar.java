package me.leo.java8;

public interface Bar extends Koo {

    // Koo 가 제공하는 default method 를 제공하고 싶지 않을 경우 추상 메소드로 재정의
    @Override
    void printNameUpperCase();

    // 만약 Koo Interface 와 동일한 이름의 default method 가 존재하는 경우 구현하는 클래스에서 직접 구현을 해야 한다.
}
