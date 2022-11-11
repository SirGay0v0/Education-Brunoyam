package Homework4;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animals {

    @Override
    void voice() {
        System.out.println("Wav!");
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bobik");
        dog.setAge(2);
        dog.setWeight(4);

//        ArrayList<Dog> dogs = new ArrayList<Dog>();
//        for(int i = 0; i<100; i++){
//            Dog d new Dog();
//            dogs.add(d);
//        }
    }
}