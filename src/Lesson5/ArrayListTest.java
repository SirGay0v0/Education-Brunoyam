package Lesson5;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add((int) (Math.random() * 100));
        }
        integers.sort(Comparator.reverseOrder());
     //   Collections.reverse(integers);
        for (Integer i :integers) {
            System.out.println(i);
        }
    }
}
