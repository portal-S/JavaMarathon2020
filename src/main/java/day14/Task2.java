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
                String line = scanner.nextLine();
                if(Integer.parseInt(line.split(" ")[1]) < 0){
                    peoples = null;
                    throw new Exception("Некорректный входной файл");
                }
                peoples.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
            e.printStackTrace();
            return peoples;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peoples;

    }
}
