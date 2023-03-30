package com.fpiacentini08.challenges.challenge004;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountWordsOccurrencesTest {

    @Test
    void givenOneWordPhrase_whenExecute_shouldReturnCorrectMap(){
        String inputString = "test";
        var response = CountWordsOccurrences.execute(inputString);
        assertEquals(1, response.size());
        assertEquals(1, response.get("test"));
    }

    @Test
    void given2EqualWordsPhrase_whenExecute_shouldReturnCorrectMap(){
        String inputString = "test test";
        var response = CountWordsOccurrences.execute(inputString);
        assertEquals(1, response.size());
        assertEquals(2, response.get("test"));
    }

    @Test
    void given2EqualWordsWithDifferentCasePhrase_whenExecute_shouldReturnCorrectMap(){
        String inputString = "test tESt";
        var response = CountWordsOccurrences.execute(inputString);
        assertEquals(1, response.size());
        assertEquals(2, response.get("test"));
    }

    @Test
    void given2EqualWordsAnd1DifferentWordPhrase_whenExecute_shouldReturnCorrectMap(){
        String inputString = "test this test";
        var response = CountWordsOccurrences.execute(inputString);
        assertEquals(2, response.size());
        assertEquals(2, response.get("test"));
        assertEquals(1, response.get("this"));
    }

    @Test
    void givenMixedPhrase_whenExecute_shouldReturnCorrectMap(){
        String inputString = "Hello this is a test string this is a test hello is this a test it is it is";
        var response = CountWordsOccurrences.execute(inputString);
        assertEquals(7, response.size());
        assertEquals(2, response.get("hello"));
        assertEquals(3, response.get("this"));
        assertEquals(5, response.get("is"));
        assertEquals(3, response.get("a"));
        assertEquals(3, response.get("test"));
        assertEquals(1, response.get("string"));
        assertEquals(2, response.get("it"));
    }

}
