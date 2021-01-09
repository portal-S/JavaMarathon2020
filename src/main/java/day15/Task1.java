package day15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/missing_shoes.txt");
        File file1 = new File("src/main/resources/shoes.csv");
        if(!file.exists()) file.createNewFile();
        Scanner scanner = new Scanner(file1);
        PrintWriter printWriter = new PrintWriter(file);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String[] info = s.split(";");
            if(Integer.parseInt(info[2]) == 0) printWriter.println(s);
        }
        scanner.close();
        printWriter.close();
    }
}
