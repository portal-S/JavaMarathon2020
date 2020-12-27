package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] info = new int[4];
        Random random = new Random();
        info[1] = 10000;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
            if(array[i] > info[0]) info[0] = array[i];
            else if(array[i] < info[1]) info[1] = array[i];
            if(array[i] % 10 == 0){
                info[2]++;
                info[3]+=array[i];
            }
        }
        for(int i : info) System.out.println(i);
    }
}
