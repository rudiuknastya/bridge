package bridge;

public class WorkerMove implements Move{
    @Override
    public void move() {
        pickaxeUp();
        pickaxeDown();
    }
    private void pickaxeUp(){
        System.out.println("Raise pickaxe");
    }
    private void pickaxeDown(){
        System.out.println("Low pickaxe");
    }
}
