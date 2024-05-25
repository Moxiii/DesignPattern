package Singleton;

import org.springframework.stereotype.Component;

@Component
public class User {
    public static void main(String[] args) {
        CandyCrush game = CandyCrush.getInstance();
        game.addScore("player1", 1000);
        game.addScore("player2", 1500);

        System.out.println(game.getScores());
    }
}
