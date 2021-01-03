package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.printf("Изготовитель: %s, год выпуска: %s, длина: %s, вес: %s, количество топлива в баке: %s", producer, year, length, weight, fuel);
    }

    public String toString(){
        return String.format("Изготовитель: %s, год выпуска: %s, длина: %s, вес: %s, количество топлива в баке: %s", producer, year, length, weight, fuel);
    }

    public void fillUp(int i){
        this.fuel+=i;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
