package org.example;

import java.util.ArrayList;
import java.util.List;

public class EnglishСomposition extends AbstractGame{

    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (char myChar = 'a'; myChar < 'z'; myChar++) {
            charList.add(Character.toString(myChar));
        }
        return charList;
    }
}
