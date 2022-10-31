package Homework2.Exercise1;


import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        int first, second;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первый разряд двухмерного массива: "); //Устанавливаем кол-во строк в двумерном массиве
        first = sc.nextInt();                                            //

        System.out.print("Введите второй разряд двухмерного массива: "); //Устанавливаем кол-во элементов в каждой строке
        second = sc.nextInt();                                           //

        int[][] Array = new int[first][second];


    }
}


