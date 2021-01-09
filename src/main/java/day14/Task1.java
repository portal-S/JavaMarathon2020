package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/day141.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file){
        String s = "";
        try {
            Scanner scanner = new Scanner(file);
            s = scanner.nextLine();
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Некорректный входной файл");
            e.printStackTrace();
        }
        int sum = 0;
        String[] sInts = s.split(" ");
        for(int i = 0; i < sInts.length; i++){
            sum+=Integer.parseInt(sInts[i]);
        }
        System.out.println(sum);
    }
}
