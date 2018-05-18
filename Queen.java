package Lab3;

public class Queen extends ChessPiece{

    public static final int QUEEN_IMPORTANCE = 9;

    public Queen() {
        super(QUEEN_IMPORTANCE);
    }

    @Override
    void move() {
        System.out.println("like a bishop or a rock");
    }

    @Override
    public String toString() {
        return "Queen{}";
    }

}
