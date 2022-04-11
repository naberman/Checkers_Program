package Checkers;

import Checkers.Board_and_Controller.Piece;

public interface Move extends Comparable<Move> {
    int[] getStartingLocation();
    int[] getEndingLocation();
    Piece getPiece();
    int getMoveScore();
}
