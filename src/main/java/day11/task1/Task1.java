package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse1 = new Warehouse();
        Worker worker = new Picker(0, false, warehouse);
        Worker worker1 = new Courier(0, false, warehouse);
        Worker worker2 = new Picker(0, false, warehouse1);
        Worker worker3 = new Courier(0, false, warehouse1);
        businessProcess(worker);
        businessProcess(worker1);
        System.out.println(worker.toString());;
        System.out.println(worker1.toString());;
        worker2.doWork();
        worker3.doWork();
        System.out.println(worker.toString());;
        System.out.println(worker1.toString());;
    }

    static void businessProcess(Worker worker){
        for(int i = 0; i <= 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
