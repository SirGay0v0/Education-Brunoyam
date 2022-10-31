package Homework2.Exercise2;


import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        int first, second, i, j;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первый разряд двухмерного массива: "); //Устанавливаем кол-во строк в двумерном массиве
        first = sc.nextInt();

        System.out.print("Введите второй разряд двухмерного массива: "); //Устанавливаем кол-во элементов в каждой строке
        second = sc.nextInt();

        int[][] Array = new int[first][second];

        for (i = 0; i < first; i++) {
            for (j = 0; j < second; j++) {
                Array[i][j] = (int) (Math.random() * 100); // Каждый элемент - случайное целое число от 0 до 100
            }
        }
    }
}


