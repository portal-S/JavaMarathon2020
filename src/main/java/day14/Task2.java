package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file){
        List<String> peoples = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                peoples.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Некорректный входной файл");
            e.printStackTrace();
            return peoples;
        }
        return peoples;

    }
}
