package Lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] testArr = new int[]{};
        int[] array = new int[100];

        System.out.println(Arrays.toString(testArr));

        random(array);
        long start = System.currentTimeMillis();
        insrtionSort(array);
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println(result);

        System.out.println(Arrays.toString(testArr));
    }

    public static void insrtionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                --j;
            }
            arr[j] = temp;
        }
    }

    public static void random(int[] array) {
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}


