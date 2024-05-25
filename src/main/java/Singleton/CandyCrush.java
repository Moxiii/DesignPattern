package Singleton;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class CandyCrush {
    private static CandyCrush instance;
    private Map<String, Integer> scores;

    private CandyCrush() {
        scores = new HashMap<>();
    }

    public static CandyCrush getInstance() {
        if (instance == null) {
            instance = new CandyCrush();
        }
        return instance;
    }

    public void addScore(String login, int score) {
        scores.put(login, score);
    }

    public Map<String, Integer> getScores() {
        return scores;
    }
}