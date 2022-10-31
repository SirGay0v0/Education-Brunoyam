package Homework1.Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число №1: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите число №2: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}