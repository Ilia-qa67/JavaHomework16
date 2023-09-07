import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {
    @Test
    public void FirstPlayerWins() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 100);
        Player player2 = new Player(2, "Kolya", 50);

        game.register(player1);
        game.register(player2);

        Assertions.assertEquals(1, game.round("Vasya","Kolya"));
    }

    @Test
    public void SecondPlayerWins() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 50);
        Player player2 = new Player(2, "Kolya", 100);

        game.register(player1);
        game.register(player2);

        Assertions.assertEquals(2, game.round("Vasya","Kolya"));
    }

    @Test
    public void FriendshipWins() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 50);
        Player player2 = new Player(2, "Kolya", 50);

        game.register(player1);
        game.register(player2);

        Assertions.assertEquals(0, game.round("Vasya","Kolya"));
    }


    @Test
    public void FirstPlayerNotExist() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 100);
        Player player2 = new Player(2, "Kolya", 50);

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Petya","Kolya"));

    }

    @Test
    public void SecondPlayerNotExist() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 100);
        Player player2 = new Player(2, "Kolya", 50);

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Vasya","Petya"));

    }
}
