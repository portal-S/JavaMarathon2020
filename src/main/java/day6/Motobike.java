package day6;

public class Motobike {
    private int year;
    private String color;
    private String model;

    public Motobike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
        return Math.abs(year - inputYear);
    }
}
