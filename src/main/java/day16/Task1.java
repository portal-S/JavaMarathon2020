package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/day14.txt");
        printResult(file);
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] info = line.split(" ");
            double sum = 0;
            for(int i = 0; i < info.length; i++) sum+=Double.parseDouble(info[i]);
            double result = sum / info.length;
            System.out.printf(result + " --> %.3f", result);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

