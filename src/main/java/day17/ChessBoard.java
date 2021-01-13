package day17;

public class ChessBoard {
    private ChessPiece[][] figures;

    public ChessBoard(ChessPiece[][] figures) {
        this.figures = figures;
    }

    public void print(){
        for (ChessPiece[] chessPieces : figures){
            for (ChessPiece chessPiece : chessPieces){
                System.out.print(chessPiece);
            }
            System.out.println();
        }
    }
}
