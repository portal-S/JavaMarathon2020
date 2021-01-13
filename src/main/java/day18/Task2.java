package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(numCount(747687478));
    }

    public static int numCount(int i){
        if(i == 0) return 0;
        if(i % 10 == 7) return 1 + numCount(i / 10);
        else return numCount(i / 10);
    }
}
