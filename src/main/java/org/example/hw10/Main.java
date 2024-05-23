package org.example.hw10;

public class Main {

    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = calculator.doCalc(array);
            System.out.println("Результат расчета: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
            System.out.println("Причина: " + e.getCause().getMessage());
        }
    }
}
