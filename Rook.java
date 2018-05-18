package Lab3;

public class Rook extends ChessPiece{

    public static final int ROOK_IMPORTANCE = 5;

    public Rook() {
        super(ROOK_IMPORTANCE);
    }

    @Override
    void move() {
        System.out.println("horizonally or vertically");
    }

    @Override
    public String toString() {
        return "Rook{}";
    }


}
