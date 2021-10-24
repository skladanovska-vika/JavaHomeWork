package com.pb.skladanovska.hw3;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        int positive = 0;
        System.out.println("Введите 10 целых чисел:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Сумма всех элементов массива равна:");
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        System.out.println("Сумма положительных элементов массива равна:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                positive = positive + array[i];
        }
        System.out.println(positive);
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));

    }
}
