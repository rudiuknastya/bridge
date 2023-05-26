package bridge;

public class Villager extends Character{
    Move move;

    public Villager(Move move) {
        super(move);
    }

    @Override
    public void move() {
        move.move();
    }
}
