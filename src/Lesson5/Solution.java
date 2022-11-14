package Lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 4, 6, 7, 3, 2, 9, 0, 4};
        System.out.println(Arrays.toString(testArray));
        sortBySelect(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void sortBySelect(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
