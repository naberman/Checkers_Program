package Checkers.Board_and_Controller;

public interface Board {
    int getBoardValue();
    Piece getPiece(int xLocation, int yLocation);
    boolean deletePiece(Piece piece);
    boolean putPiece();
    Piece[] getAllPieces();
}