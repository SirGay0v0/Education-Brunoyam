package Homework3.Exercise1;

import Homework2.Exercise3.Input;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 {
    public static void main(String args[]) throws IOException {


        File file = new File("..\\src\\Homework3\\Exercise1\\example.txt");
        FileWriter fw = new FileWriter("example.txt");
    fw.write(Input.input());
    fw.close();

    }
}
