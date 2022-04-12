package Checkers;

import Checkers.Board_and_Controller.Piece;

public interface Move extends Comparable<Move> {
    int[] getStartingLocation();
    int[] getEndingLocation();
    //Piece getPiece(); i dont thing this is good for this case it will be contraler tat will find the piece based on the info in this class;
    int getMoveScore();
    void setMeveScore();  // i just added this some times we will need to change or put a score in later
}
