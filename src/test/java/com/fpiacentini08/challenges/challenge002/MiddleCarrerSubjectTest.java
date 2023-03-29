package com.fpiacentini08.challenges.challenge002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleCarrerSubjectTest {

    @Test
    void givenTwoSubjectsCarrer_whenGetMiddleSubject_shouldReturnFirstSubject(){
        String[][] subjectsPrerequisitesList = {
                {"A", "B"}
        };

        var response = MiddleCarrerSubject.getMiddleSubject(subjectsPrerequisitesList);

        assertEquals("A", response);
    }

    @Test
    void givenFiveSubjectsCarrer_whenGetMiddleSubject_shouldReturnThirdSubject(){
        String[][] subjectsPrerequisitesList = {
                {"A", "B"},
                {"D", "E"},
                {"B", "C"},
                {"C", "D"}
        };

        var response = MiddleCarrerSubject.getMiddleSubject(subjectsPrerequisitesList);

        assertEquals("C", response);
    }


    @Test
    void given11SubjectsCarrer_whenGetMiddleSubject_shouldReturnSixthSubject(){
        String[][] subjectsPrerequisitesList = {
                {"E", "F"},
                {"B", "C"},
                {"D", "E"},
                {"H", "I"},
                {"C", "D"},
                {"I", "J"},
                {"J", "K"},
                {"A", "B"},
                {"F", "G"},
                {"G", "H"}
        };

        var response = MiddleCarrerSubject.getMiddleSubject(subjectsPrerequisitesList);

        assertEquals("F", response);
    }


    @Test
    void given6SubjectsCarrer_whenGetMiddleSubject_shouldReturnThirdSubject(){
        String[][] subjectsPrerequisitesList = {
                {"C", "D"},
                {"A", "B"},
                {"D", "E"},
                {"E", "F"},
                {"B", "C"}
        };

        var response = MiddleCarrerSubject.getMiddleSubject(subjectsPrerequisitesList);

        assertEquals("C", response);
    }

}
