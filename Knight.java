package Lab3;

public class Knight extends ChessPiece{

    public static final int KNIGHT_IMPORTANCE = 2;

    public Knight() {
        super(KNIGHT_IMPORTANCE);
    }

    @Override
    void move() {
        System.out.println("like an L");
    }

    @Override
    public String toString() {
        return "Knight{}";
    }


}
