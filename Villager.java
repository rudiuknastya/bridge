package bridge;

public class Villager extends Character{
    Move move;

    public Villager(Move move) {
        this.move = move;
    }

    @Override
    public void move() {
        move.move();
    }
}
