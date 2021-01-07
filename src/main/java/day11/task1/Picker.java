package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", countPickedOrders=" + warehouse.getCountPickedOrders() +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.countPickedOrders++;
        bonus();
    }

    @Override
    public void bonus() {
        if(warehouse.getCountPickedOrders() == 10000) salary+=70000;
        else if(warehouse.getCountPickedOrders() < 10000) System.out.println("Бонус пока не доступен");
        else System.out.println("Бонус уже был выплачен");
    }
}
