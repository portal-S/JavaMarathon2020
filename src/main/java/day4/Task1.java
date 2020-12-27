package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] parmS = new int[6];
        int[] array = new int[scanner.nextInt()];
        parmS[0] = array.length;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
            if(array[i] > 8) parmS[1]++;
            else if(array[i] == 1) parmS[2]++;
            if (array[i] % 2 == 0) parmS[3]++;
            else parmS[4]++;
            parmS[5]+=array[i];
        }
        for (int i = 0; i < parmS.length; i++) System.out.println(parmS[i]);

    }
}
