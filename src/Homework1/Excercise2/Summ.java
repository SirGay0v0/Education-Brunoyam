package Homework1.Excercise2;

import java.util.Scanner;

public class Summ {
    Scanner scanner = new Scanner(System.in);
    int result1, result2, result3;

    public int sum(int a) {
        System.out.print("Введите число №1: ");
        int num1 = scanner.nextInt();
        result1 = a * num1;
        System.out.print("Произведение параметра 5 и введенного числа = ");
        return result1;
    }

    public int sum(int a, int b) {
        System.out.print("Введите число №2: ");
        int num2 = scanner.nextInt();
        result2 = b * a * num2;
        System.out.print("Это произведение параметра 6, результата прошлого произведения и введенного числа = ");
        return result2;
    }

    public int sum(int a, int b, int c) {
        System.out.print("Введите число №3: ");
        int num3 = scanner.nextInt();
        result3 = num3 * a * b * c;
        System.out.print("Это произведение параметра 4, двух прошлых произведений и введенного числа = ");
        return result3;
    }
}