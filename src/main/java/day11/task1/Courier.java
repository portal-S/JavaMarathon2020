package day11.task1;

public class Courier  implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", getCountDeliveredOrders=" + warehouse.getCountDeliveredOrders() +
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
        salary+=100;
        warehouse.countDeliveredOrders++;
        bonus();
    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() == 10000) salary+=50000;
        else if(warehouse.getCountDeliveredOrders() < 10000) System.out.println("Бонус пока не доступен");
        else System.out.println("Бонус уже был выплачен");
    }
}
