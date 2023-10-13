package edu.seminars.oop.fun;

public class GameHandlerGood {
    public void start(int boardSize, String playerName) {
        Player player  = createPlayer(playerName);
        Board board = createBoard(boardSize, player);
        startGame(board);
    }

    private Player createPlayer(String name) {
        return new Player(name);
    }

    private Board createBoard(int size, Player player) {
        return new Board(player, size);
    }

    private void startGame(Board board) {
        Game game = new Game(board);

        game.start();
    }
}
