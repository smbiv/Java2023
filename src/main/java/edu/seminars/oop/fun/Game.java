package edu.seminars.oop.fun;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void start() {
        System.out.println("Игра началась: " + board);
    }
}
