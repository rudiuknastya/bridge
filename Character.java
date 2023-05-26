package bridge;

public abstract class Character {
    protected Move move;

    public Character(Move move) {
        this.move = move;
    }

    public abstract void move();
}
