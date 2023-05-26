package bridge;

public class Worker extends Character{
    Move move;

    public Worker(Move move) {
        super(move);
    }

    @Override
    public void move() {
        move.move();
    }
}
