package org.example.hw5_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnique {

    public static void main(String[] args) {

        List<Integer> arbitraryNumbers = List.of(1, 2, 3, 4, 5, 2, 3, 6, 7, 1);
        List<Integer> uniqueNumbers = findUnique(arbitraryNumbers);
        System.out.println("Unique Numbers: " + uniqueNumbers);
    }

    public static List<Integer> findUnique(List<Integer> arbitraryNumbers) {
        Set<Integer> uniqueSet = new HashSet<>(arbitraryNumbers);
        return new ArrayList<>(uniqueSet);
    }
}
