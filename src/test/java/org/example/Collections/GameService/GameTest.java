package org.example.Collections.GameService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameTest {

    @Test

    public void TestWhenPlayer1Wins() {
        Player player1 = new Player(1, "Andrey", 11);
        Player player2 = new Player(2, "Ilya", 10);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 1;

        int actual = game.round("Andrey", "Ilya");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void TestWhenPlayer2Wins() {
        Player player1 = new Player(1, "Andrey", 10);
        Player player2 = new Player(2, "Ilya", 11);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 2;

        int actual = game.round("Andrey", "Ilya");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void TestWhenDraw() {
        Player player1 = new Player(1, "Andrey", 10);
        Player player2 = new Player(2, "Ilya", 10);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 0;

        int actual = game.round("Andrey", "Ilya");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void TestWhenPlayer1NotExist() {
        Player player1 = new Player(1, "Andrey", 10);
        Player player2 = new Player(2, "Ilya", 10);

        Game game = new Game();

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Petya", "Ilya"));
    }

    @Test

    public void TestWhenPlayer2NotExist() {
        Player player1 = new Player(1, "Andrey", 10);
        Player player2 = new Player(2, "Ilya", 10);

        Game game = new Game();

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Andrey", "Petya"));
    }
}
