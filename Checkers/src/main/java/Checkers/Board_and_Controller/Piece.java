package Checkers.Board_and_Controller;

public interface Piece {
    int getXLocation();
    int getYLocation();
    boolean movePiece(int xLocation, int ylocation);
    boolean isKing();
    boolean promote();
    boolean isRed();
}
