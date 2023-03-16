package org.example;

import java.util.List;

public interface Game {
    void start( Integer sizeWord, Integer maxTry);
    Answer inputAnswer(String value);
    GameStatus getGameStatus();
    GameStatus getGameWin();

    List<String> getHistory();
}
