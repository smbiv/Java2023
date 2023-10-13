package edu.seminars.oop.fun;

public class GameHandlerBad {
    private Player player;
    private Board board;

    public void start(int boardSize, String playerName) {
        createBoard(boardSize);
        createPlayer(playerName);
        startGame();
    }

    private void createPlayer(String name) {
        player = new Player(name);
    }

    private void createBoard(int size) {
        board = new Board(player, size);
    }

    private void startGame() {
        Game game = new Game(board);

        game.start();
    }
}
