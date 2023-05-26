package bridge;

public class Worker extends Character{
    Move move;

    public Worker(Move move) {
        this.move = move;
    }

    @Override
    public void move() {
        move.move();
    }
}
