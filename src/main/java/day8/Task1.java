package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("0");
        for (int i = 1; i <= 20000; i++){
            s.append(" " + i);
        }
        System.out.println(s);
    }
}
