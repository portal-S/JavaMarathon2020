package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            double d1 = scanner.nextDouble();
            double d2 = scanner.nextDouble();
            if(d2 != 0){
                System.out.println(d1 / d2);
                continue;
            }
            break;
        }

    }
}
