package bridge;

public class VillagerMove implements Move{
    @Override
    public void move() {
        bendDown();
        takeSomething();
        rise();
        turn();
        goForward();
        putSomething();
        turn();
        goForward();
    }
    private void bendDown(){
        System.out.println("Bend down");
    }
    private void takeSomething(){
        System.out.println("Take something");
    }
    private void rise(){
        System.out.println("Rise");
    }
    private void turn(){
        System.out.println("Turn");
    }
    private void goForward(){
        System.out.println("Go forward");
    }
    private void putSomething(){
        System.out.println("Put Something");
    }
}
