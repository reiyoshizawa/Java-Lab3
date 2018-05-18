package Lab3;

public class Pawn extends ChessPiece{

    public static final int PAWN_IMPORTANCE = 1;

    public Pawn() {
        super(PAWN_IMPORTANCE);
    }

    @Override
    void move() {
        System.out.println("forward1");
    }

//    @Override
//    void promote(ChessPiece newPiece) {
//        if (!isHasBeenPromoted()) {
//            if (newPiece.getValue() == 5 && newPiece.getValue() == 9) {
//                setNewPiece(newPiece);
//                setHasBeenPromoted(true);
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Pawn{}";
    }


}
