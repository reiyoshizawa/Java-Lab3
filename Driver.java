//package Lab3;
//
//public class Driver {
//
//    public static void main(String[] args) {
//
//        ChessPiece[] a = new ChessPiece[7];
//
//        ChessPiece pawn1 = new Pawn(1);
//        ChessPiece pawn2 = new Pawn(1);
//        ChessPiece knight1 = new Knight(2);
//        ChessPiece bishop1 = new Bishop(3);
//        ChessPiece rook1 = new Rook(5);
//        ChessPiece queen1 = new Rook(9);
//        ChessPiece king1 = new Rook(1000);
//
//        a[0] = pawn1;
//        a[1] = knight1;
//        a[2] = bishop1;
//        a[3] = rook1;
//        a[4] = queen1;
//        a[5] = king1;
//        a[6] = pawn2;
//
//       for (int i = 0; i < 7; i++) {
//           a[i].move();
//       }
//
////        pawn1.move();
//
//        pawn1.promote(rook1);
//        pawn2.promote(rook1);
//        System.out.println(pawn1.isHasBeenPromoted());
//        System.out.println(pawn1.equals(pawn2));
//
////        Pawn bb = (Pawn)pawn1;
//
////        System.out.println(bb.isHasBeenPromoted());
//
//
//    }
//}
