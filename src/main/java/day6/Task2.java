package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("AirPlanes", 1990, 300, 700);
        airplane.info();
        airplane.setLength(350);
        airplane.setYear(2000);
        airplane.fillUp(530);
        airplane.fillUp(353);
        airplane.info();
    }
}
