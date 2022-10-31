package Homework1.Excercise3;

import java.util.Scanner;

public class HelpRandom {
    int upBorder;

    public String upBorder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вверхнюю границу диапазона случайных чисел: ");
        upBorder = sc.nextInt();
        return "";
    }

    public String randomNumber() {
        int rand, i = 1;
        do {
            for (; ; i++) {
                rand = (int) (Math.random() * 100);
                if (rand > upBorder) {
                    System.out.println("Попытка " + i + " : " + rand);
                    continue;
                } else break;
            }
        } while (rand > upBorder);
        return "На " + i + " попытке мы получили число " + rand;
    }
}

