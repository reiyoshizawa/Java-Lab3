package Lab3;

public class Bishop extends ChessPiece{

    public static final int BISHOP_IMPORTANCE = 3;

    public Bishop() {
        super(BISHOP_IMPORTANCE);
    }

    @Override
    void move() {
        System.out.println("diagonally");
    }

    @Override
    public String toString() {
        return "Pawn";
    }

}
