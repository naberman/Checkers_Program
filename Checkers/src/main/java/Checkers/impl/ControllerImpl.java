package Checkers.impl;
import Checkers.Move;
import  src.main.java.Checkers.Controller;

import java.util.List;

public class ControllerImpl implements Controller {

    @Override
    public List<Move> GetAllRedMoves() {
        return null;
    }

    @Override
    public List<Move> GetAllBlackMoves() {
        return null;
    }

    @Override
    public List<Move> GetMovesOfPiece(int[] location) {
        return null;
    }

    @Override
    public boolean DoBlackMove(Move m) {
        return false;
    }

    @Override
    public boolean DoRedMove(Move m) {
        return false;
    }

    @Override
    public boolean CheckRedMove(Move m) {
        return false;
    }

    @Override
    public boolean CheckBlackMove(Move m) {
        return false;
    }
}
