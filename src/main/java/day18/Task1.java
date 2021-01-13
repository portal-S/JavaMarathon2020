package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(array, array.length));
    }

    public static int recursionSum(int[] array, int length){
        if(length == 0) return 0;
        int sum = array[length - 1];
        return sum + recursionSum(array, length - 1);
    }
}
