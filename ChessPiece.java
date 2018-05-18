package Lab3;

public abstract class ChessPiece {

    private int value;
    private boolean hasBeenPromoted;
    public ChessPiece newPiece;

    public boolean isHasBeenPromoted() {
        return hasBeenPromoted;
    }

    public void setHasBeenPromoted(boolean hasBeenPromoted) {
        this.hasBeenPromoted = hasBeenPromoted;
    }

    public ChessPiece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(ChessPiece newPiece) {
        this.newPiece = newPiece;
    }

    public ChessPiece(){
    }

    public ChessPiece(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    abstract void move();

    void promote(ChessPiece newPiece) {

        switch (this.getValue()) {

            case 1:
                if (newPiece.getValue() == 5 || newPiece.getValue() == 9) {
                    setNewPiece(newPiece);
                    setHasBeenPromoted(true);
                };
                break;
            case 2:
                if (newPiece.getValue() == 5 || newPiece.getValue() == 9) {
                    setNewPiece(newPiece);
                    setHasBeenPromoted(true);
                };
                break;
            case 3:
                if (newPiece.getValue() == 5 || newPiece.getValue() == 9) {
                    setNewPiece(newPiece);
                    setHasBeenPromoted(true);
                };
                break;
            case 5:
                if (newPiece.getValue() == 5 || newPiece.getValue() == 9) {
                    setNewPiece(newPiece);
                    setHasBeenPromoted(true);
                };
                break;
            case 9:
                if (newPiece.getValue() == 5 || newPiece.getValue() == 9) {
                    setNewPiece(newPiece);
                    setHasBeenPromoted(true);
                };
                break;
            case 1000:
                if (newPiece.getValue() == 5 || newPiece.getValue() == 9) {
                    setNewPiece(newPiece);
                    setHasBeenPromoted(true);
                };
                break;

        }

    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean result =super.equals(obj);

        // cas　型を変える方法
        ChessPiece cp = (ChessPiece)obj;
        if (this.isHasBeenPromoted() && cp.isHasBeenPromoted()) {
            if (this.getNewPiece() == cp.getNewPiece()) {
                result = true;
                return result;
            } else {
                result = false;
                return result;
            }
        } else if (this.isHasBeenPromoted() || cp.isHasBeenPromoted()){
            result = false;
            return result;
        } else {
            result = false;
            return result;
        }
    }

    // 2つともpromoteしてる場合
    //   - promote先が同じ > true
    //   - promote先が異なる > false
    //
    // 2つのチェスのうちどちらか一つがpromoteしてる場合
    //   - false
    //
    // 2つともpromoteしていない場合
    //   - false

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
