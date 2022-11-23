package me.leo.java8;

import java.util.*;

public class Iterable {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Leo");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        names.forEach(System.out::println);

        System.out.println("-------------------------");

        Spliterator<String> spliterator = names.spliterator();
        while (spliterator.tryAdvance(System.out::println)) ; // 요소가 없는 경우 false 리턴

        System.out.println("-------------------------");

        long e = names.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("T"))
                .count();

        System.out.println(e); // 1

        System.out.println("-------------------------");

        names.removeIf(s -> s.startsWith("L"));
        names.forEach(System.out::println);

        System.out.println("-------------------------");

        Comparator<String> compareTo = String::compareTo;
        names.sort(compareTo);
        names.forEach(System.out::println);

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase);
        names.forEach(System.out::println);

        System.out.println("-------------------------");

        names.sort(compareToIgnoreCase.reversed()); // 내림차순 정렬
        names.forEach(System.out::println);

        System.out.println("-------------------------");

        names.sort(Comparator.naturalOrder()); // 오름차순 정렬
        names.forEach(System.out::println);

        System.out.println("-------------------------");

        names.sort(Comparator.reverseOrder()); // 내림차순 정렬
        names.forEach(System.out::println);

        System.out.println("-------------------------");

        List<Student> students = Arrays.asList(
                new Student(12, "Kim", "A"),
                new Student(13, "Shin", "B"),
                new Student(13, "Lee", "C"),
                new Student(12, "Kang", "C"),
                new Student(11, "Chul", "A"),
                new Student(11, "Jang", "B"),
                new Student(13, "Ahn", "A"),
                new Student(11, "Hwang", "C"),
                new Student(12, "Lim", "B")
        );

        // 반 이름 정렬(오름차순)
        Comparator<Student> comparingClassName = Comparator.comparing(Student::getClassName, Comparator.naturalOrder());

        // 나이 정렬(내림차순)
        Comparator<Student> comparingAge = Comparator.comparing(Student::getAge, Comparator.reverseOrder());

        students.stream()
                .sorted(comparingClassName.thenComparing(comparingAge))
                .forEach(o -> System.out.println(o.getAge() + " : " + o.getName() + " : " + o.getClassName()));

        System.out.println("-------------------------");

        List<Student> nullStudent = Arrays.asList(
                new Student(12, "Kim", "A"),
                new Student(13, "Shin", "B"),
                new Student(13, "Lee", null),
                new Student(12, "Kang", null),
                new Student(11, "Chul", "A"),
                new Student(11, "Jang", "B"),
                new Student(13, "Ahn", "A"),
                new Student(11, "Hwang", null),
                new Student(12, "Lim", "B")
        );

        Comparator<Student> nullFirst = Comparator.comparing(Student::getClassName, Comparator.nullsFirst(Comparator.naturalOrder()));

        nullStudent.stream()
                .sorted(nullFirst)
                .forEach(o -> System.out.println(o.getAge() + " : " + o.getName() + " : " + o.getClassName()));

        System.out.println("-------------------------");

        Comparator<Student> nullLast = Comparator.comparing(Student::getClassName, Comparator.nullsLast(Comparator.naturalOrder()));

        nullStudent.stream()
                .sorted(nullLast)
                .forEach(o -> System.out.println(o.getAge() + " : " + o.getName() + " : " + o.getClassName()));
    }
}
