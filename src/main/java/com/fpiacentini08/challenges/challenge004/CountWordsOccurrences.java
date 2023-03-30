package com.fpiacentini08.challenges.challenge004;

import java.util.HashMap;
import java.util.Map;

public class CountWordsOccurrences {

    private final static String SEPARATOR = " ";

    public static Map<String, Integer> execute(String inputString){
        var wordsList = inputString.toLowerCase().split(SEPARATOR);
        var wordsMapWithOccurrences = new HashMap<String, Integer>();
        for(String word : wordsList){
            wordsMapWithOccurrences.computeIfPresent(word, (key, value) -> value+1);
            wordsMapWithOccurrences.putIfAbsent(word, 1);
        }
        return wordsMapWithOccurrences;
    }
}
