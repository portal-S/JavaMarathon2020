package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> peoples = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String[] info = scanner.nextLine().split(" ");
                int age = Integer.parseInt(info[1]);
                if(age < 0) throw new AgeException("Некорректный входной файл");
                peoples.add(new Person(info[0], Integer.parseInt(info[1])));
            }
            scanner.close();
        } catch (FileNotFoundException | AgeException e){
            System.out.println("Файл не найден");
            e.printStackTrace();
            return peoples;
        }
        return peoples;

    }
}
