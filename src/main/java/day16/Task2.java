package day16;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src/file1.txt");
        File file2 = new File("src/file2.txt");
        Random random = new Random();
        if(!file1.exists()) file1.createNewFile();
        if(!file2.exists()) file2.createNewFile();
        PrintWriter pr1 = new PrintWriter(file1);
        PrintWriter pr2 = new PrintWriter(file2);

        for(int i = 0; i < 1000; i++){
            pr1.println(random.nextInt(100));
        }

        pr1.close();

        Scanner scanner = new Scanner(file1);
        int i = 1;
        double sum = 1;
        while (scanner.hasNext()){
            double d = Double.parseDouble(scanner.nextLine());
            sum+=d;
            if(i % 20 == 0){
                pr2.println(sum / 20);
                sum = 0;
            }
            i++;
        }
        pr2.close();
        scanner.close();

        printResult(file2);

    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] s = line.split(" ");
                for (String s1 : s) sum+=(int) Double.parseDouble(s1);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
