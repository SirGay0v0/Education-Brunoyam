package Homework1.Excercise2;

public class Homework2 {
    public static void main(String[] args) {
        Summ summ = new Summ();

        System.out.println(summ.sum(5));
        System.out.println(summ.sum(6, summ.result1));
        System.out.println(summ.sum(4, summ.result1, summ.result2));
    }
}
