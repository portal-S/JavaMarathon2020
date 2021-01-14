package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] chessPiece = new ChessPiece[10][10];
        for(int i = 0; i < chessPiece.length; i++){
            for(int j = 0; j < chessPiece[i].length; j++){
                chessPiece[i][j] = ChessPiece.EMPTY;
            }
        }
        chessPiece[0][1] = ChessPiece.ROOK_BLACK;
        chessPiece[0][5] = ChessPiece.ROOK_BLACK;
        chessPiece[0][6] = ChessPiece.KING_BLACK;
        // ну и так далее заполняем доску
        ChessBoard chessBoard1 = new ChessBoard(chessPiece);
        chessBoard1.print();
    }
}
