package Lab3;

public class King extends ChessPiece{

    public static final int KING_IMPORTANCE = 1000;


    public King() {
        //  (public ChessPiece) -> super
        super(KING_IMPORTANCE);
    }

    @Override
    void move() {
        System.out.println("one square");
    }

    @Override
    public String toString() {
        return "King{}";
    }

}
