package org.example.hw5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToList {

    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = toList(array);
        System.out.println("Converted List: " + list);
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    // This is already a recommendation of IntelliJ IDEA
    public static <T> List<T> toListUpdate(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
