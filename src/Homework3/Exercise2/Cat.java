package Homework3.Exercise2;

import com.sun.source.tree.NewArrayTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cat {
    private String name;
    private int weight;
    private int tall;
    private int nativCountry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 20 & weight > 0) this.weight = weight;
        else System.out.println("Введенные значения соответствуют неземной кошке или коту");

    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        if (tall < 200 & tall > 0) this.tall = tall;
        else System.out.println("Введенные значения соответствуют неземной кошке или коту");
    }

    public void getNativCountry() {
        inDetailes();
    }

    public void setNativCountry(int nativCountry) {
        if (nativCountry < 4 & nativCountry > 0) this.nativCountry = nativCountry;
        else System.out.println("Введенные значения соответствуют неземной кошке или коту");

    }

    public void inDetailes() {
        if (nativCountry == 1) {
            System.out.println(" России");
        }
        if (nativCountry == 2) {
            System.out.println(" Англии");
        }
        if (nativCountry == 3) {
            System.out.println(" Шотландии");
        }
    }

    @Override
    public String toString() {
        return "Кошку или кота зовут \"" + name + "\" весит данное чудо природы " + weight +
                " килограмм, а рост составляет " + tall + " сантиметра(ов), это создание родом из";
    }

    public static void main(String[] args) {
        String s;
        String n;
        int w;
        int t;
        int nc;
        Cat cat = new Cat();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя кошки или кота: ");
        s = sc.nextLine();
        cat.setName(s);

        System.out.print("Введите длину кошки или кота: ");
        t = sc.nextInt();
        cat.setTall(t);

        System.out.print("Введите вес кошки или кота: ");
        w = sc.nextInt();
        cat.setWeight(w);

        System.out.print("Введите родную страну кошки или кота: ");
        nc = sc.nextInt();
        cat.setNativCountry(nc);



System.out.print(cat.toString());
cat.getNativCountry();

    }
}
