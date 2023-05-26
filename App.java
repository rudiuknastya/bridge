package bridge;

public class App {
    public static void main(String[] args) {
        Character villager = new Villager(new VillagerMove());
        Character worker = new Worker(new WorkerMove());
        System.out.println("Villager moves:");
        villager.move();
        System.out.println();
        System.out.println("Worker moves:");
        worker.move();
    }
}
