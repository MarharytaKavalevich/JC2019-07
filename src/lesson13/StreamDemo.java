package lesson13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> listForStreams = Arrays.asList("a1", "a2", "a2", "a3", "a1234567890");

        //1. Получить уникальные строки
        //2. Вывести строки длиной больше 10
        //3. Вывести получаемую строку в upperCAse and LowerCase

        //peek, filter, map, collect

       //4. Дан массив int[] array = new int[]{1, 2, 3, 4, 5, 6, 2, 3}
        //подсчитать количество вхождений каждого элемента массива и вывести элемент с максимальным вхождением

        System.out.println("Unique strings: ");
        String collect = listForStreams.stream()
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println(collect);
        System.out.println();

        System.out.println("String longer than 10: ");
        listForStreams.stream()
                .filter((e) -> e.length() > 10)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Strings in upperCase: ");
        listForStreams.stream()
                .map(e -> e.toUpperCase())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Strings in lowerCase: ");
        listForStreams.stream()
                .map(String::toLowerCase)
                .distinct()
                .peek((e) -> System.out.print(e + ","))
                .distinct()
                .collect(Collectors.toList());
        System.out.println();
        System.out.println();

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 2, 3, 3};
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer item: array) {
            if (countMap.containsKey(item))
                countMap.put(item, countMap.get(item) + 1);
            else
                countMap.put(item, 1);
        }
        System.out.println("The number of occurrences of each element of the array: ");
        System.out.println(countMap);
        System.out.println();

        System.out.println("Element with maximum occurrence: ");
        System.out.println(countMap.entrySet().stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());

    }
}
