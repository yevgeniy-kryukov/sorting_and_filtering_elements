package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static Integer[] sortArr1(Integer[] arr) {
        boolean repeat;
        do {
            repeat = false;
            for (int i = 0; i < arr.length - 1; i++) {
                Integer el1 = arr[i];
                if (el1 > arr[i + 1]) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = el1;
                    repeat = true;
                }
            }
        } while (repeat);
        return arr;
    }

    public static Integer[] sortArr2(Integer[] arr) {
        Integer el2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    el2 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = el2;
                }
            }
        }
        return arr;
    }

    public static List<String> printEvenElementsPlain1(String[] arr) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static List<String> printEvenElementsPlain2(String[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> (i + 1) % 2 == 0)
                .mapToObj(i -> arr[i])
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] arr = {"a", "b", "c", "d", "e"};
        Integer[] arrInt = {1, 5, 6, 2, 3, 2, 5, 7, 6};
        System.out.println("plain1: ");
        System.out.println(printEvenElementsPlain1(arr));
        System.out.println("plain2: ");
        System.out.println(printEvenElementsPlain2(arr));
        System.out.println("sorted1:");
        System.out.println(Arrays.toString(sortArr1(arrInt.clone())));
        System.out.println("sorted2:");
        System.out.println(Arrays.toString(sortArr2(arrInt.clone())));
    }
}
