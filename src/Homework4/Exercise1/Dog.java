package Homework4.Exercise1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dog extends Animals {


    public Dog(String name) {
        super(name);
    }

    public static void main(String[] args) {


        Dog dog = new Dog("Bobik");
        dog.setAge(2);
        dog.setWeight(4);

        Dog[] myDogs = new Dog[100];

        File file = new File(".\\src\\Homework4\\Exercise1\\file with dogs.txt");
        if(file.delete()){
            System.out.println(" Файл \"file with dogs.txt\" файл был удален с корневой папки проекта");
        }else System.out.print("");

        for (int i = 0; i < 100; i++) {
            myDogs[i] = new Dog("Dog №" + (i+1));
            try (FileWriter writer = new FileWriter(".\\src\\Homework4\\Exercise1\\file with dogs.txt", true)) {
                writer.write(String.valueOf(myDogs[i]));
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }


    }

    @Override
    public void voice() {
        System.out.println("Gaw!");
    }
}


//        try(FileWriter writer = new FileWriter("notes3.txt", false))
//        {
//            // запись всей строки
//            String text = "Hello Gold!";
//            writer.write(text);
//            // запись по символам
//            writer.append('\n');
//            writer.append('E');
//
//            writer.flush();
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }