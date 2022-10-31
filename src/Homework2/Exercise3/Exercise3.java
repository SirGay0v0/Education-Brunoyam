package Homework2.Exercise3;

import java.util.Scanner;

public class Exercise3 {
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
                System.out.print(Array[i][j] + " ");       //
            }                                              //Выводим на консоль получившийся массив
            System.out.println();                          //
        }
        System.out.println();                              //Просто отступ для удобного чтения массива

        int helpSpace = Array[0][0];                       //Создаем переменную для временного хранения первого элемента первой строки
        for (i = 0; i < first; i++) {
            for (j = 0; j < second; j++) {
                if (j == second - 1 & i < first - 1) {Array[i][j] = Array[i + 1][0];} //Первое условие: если это последний элемент строки(за исключением последеней строки), то меняем его на первый жлемент следующей строки
                else if (i == first - 1 & j == second - 1) Array[first-1][second-1] = helpSpace; //Втоорое условие: если это последний элемент последней строки, то меняем его на значение первого элемента первой строки (ранее записанного в helpSpace)
                else Array[i][j] = Array[i][j + 1]; //Если первые два условия не выполняются, то заменяем текущий элемент массива на следующий
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
