package Homework3.Exercise1;

import java.util.Scanner;

public interface Input {

    public static String input() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите любое слово или фразу: ");
        String str = scan.nextLine();
        return str;
    }
}
