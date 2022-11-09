package Homework3.Exercise3;

import java.io.File;

public class Exercise3 {
    static int amountFiles = 0;
    static int amountDirectories = 0;

    public static void listFilesForFolder(File folder) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                amountDirectories++;
                listFilesForFolder(fileEntry);
            } else {
                amountFiles++;
            }
        }
    }

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\SirGay\\IdeaProjects\\Education-Brunoyam");
        listFilesForFolder(folder);
        System.out.println("Amount of directories: " + amountDirectories);
        System.out.println("Amount of files: " + amountFiles);
    }
}