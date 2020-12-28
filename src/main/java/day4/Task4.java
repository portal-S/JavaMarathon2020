package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int sum = 0;
        int sumI = 0;
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(10000);
        for(int i = 1; i < array.length - 1; i++){
            int s = 0;
            for (int h = i - 1; h <= i + 1; h++){ s+=array[h]; }
            if(sum < s){
                sum = s;
                sumI = i;
            }
        }
        System.out.println(sum);
        System.out.println(sumI);
    }
}
