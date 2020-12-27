package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();
        int Tsum = 0;
        int Ti = 0;
        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(50);
                sum+=matrix[i][j];
            }
            if(sum >= Tsum){
                Tsum = sum;
                Ti = i;
            }
        }
        System.out.println(Ti);
    }
}
