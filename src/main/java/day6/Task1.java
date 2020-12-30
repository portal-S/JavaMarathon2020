package day6;

public class Task1 {
    public static void main(String[] args) {
        Motobike motobike = new Motobike(1990, "Black", "Model");
        System.out.println(motobike.yearDifference(2020));
        motobike.info();
    }
}
