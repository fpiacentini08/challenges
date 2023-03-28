package com.fpiacentini08.challenges.subjectsincommon;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SubjectsInCommonTest {

    @Test
    void givenArrayWith2StudentsAnd1Subject_whenExecute_shouldReturnMapWithSubjectsInCommonWith1Entry(){
        final String[][]  testList = {
                {"12", "Maths"},
                {"34", "Maths"}
        };

        var expectedResponseMap = new HashMap<Set<String>, Set<String>>();
        expectedResponseMap.put(Set.of("12","34"), Set.of("Maths"));

        var responseMap = SubjectsInCommon.execute(testList);
        assertNotNull(responseMap);
        assertEquals(1, responseMap.size());
        responseMap.computeIfPresent(Set.of("12","34"), (key, val) -> validateMapValue(key, val, responseMap, expectedResponseMap));
    }


    @Test
    void givenArrayWith3StudentsAnd1Subject_whenExecute_shouldReturnMapWithSubjectsInCommonWith3Entries(){
        final String[][]  testList = {
                {"12", "Maths"},
                {"17", "Maths"},
                {"34", "Maths"}
        };

        var expectedResponseMap = new HashMap<Set<String>, Set<String>>();
        expectedResponseMap.put(Set.of("17", "34"), Set.of("Maths"));
        expectedResponseMap.put(Set.of("12", "34"), Set.of("Maths"));
        expectedResponseMap.put(Set.of("17", "12"), Set.of("Maths"));

        var responseMap = SubjectsInCommon.execute(testList);
        assertNotNull(responseMap);
        assertEquals(3, responseMap.size());
        responseMap.computeIfPresent(Set.of("12", "34"), (key, val) -> validateMapValue(key, val, responseMap, expectedResponseMap));
        responseMap.computeIfPresent(Set.of("12", "17"), (key, val) -> validateMapValue(key, val, responseMap, expectedResponseMap));
        responseMap.computeIfPresent(Set.of("17", "34"), (key, val) -> validateMapValue(key, val, responseMap, expectedResponseMap));
    }

    @Test
    void givenArrayWithNoSubjectsInCommon_whenExecute_shouldReturnMapWithSubjectsInCommonEmpty(){
        final String[][]  testList = {
                {"12", "Maths"},
                {"34", "IT"}
        };

        var expectedResponseMap = new HashMap<Set<String>, Set<String>>();
        expectedResponseMap.put(Set.of("12", "34"), new HashSet<>());

        var responseMap = SubjectsInCommon.execute(testList);
        assertNotNull(responseMap);
        assertEquals(1, responseMap.size());
        responseMap.computeIfPresent(Set.of("12", "34"), (key, val) -> validateMapValue(key, val, responseMap, expectedResponseMap));
    }

    @Test
    void givenArrayWithStudentsAndSubjects_whenExecute_shouldReturnMapWithSubjectsInCommon(){
        final String[][]  testList = {
                {"12", "Maths"},
                {"34", "Maths"},
                {"12", "IT"},
                {"34", "Chemistry"},
                {"17", "IT"},
                {"12", "Chemistry"}
        };

        var expectedResponseMap = new HashMap<Set<String>, Set<String>>();
        expectedResponseMap.put(Set.of("12", "34"), Set.of("Maths", "Chemistry"));
        expectedResponseMap.put(Set.of("12", "17"), Set.of("IT"));
        expectedResponseMap.put(Set.of("17","34"), Set.of());

        var responseMap = SubjectsInCommon.execute(testList);
        assertNotNull(responseMap);
        assertEquals(3, responseMap.size());
        responseMap.computeIfPresent(Set.of("12", "34"), (key, val) -> validateMapValue(key, val, responseMap, expectedResponseMap));
        responseMap.computeIfPresent(Set.of("12", "17"), (key, val) -> validateMapValue(key, val, responseMap, expectedResponseMap));
        responseMap.computeIfPresent(Set.of("17","34"), (key, val) -> validateMapValue(key, val, responseMap, expectedResponseMap));
    }

    private Set<String> validateMapValue(Set<String> key, Set<String> val, Map<Set<String>, Set<String>> responseMap, Map<Set<String>, Set<String>> expectedResponseMap){
        assertEquals(expectedResponseMap.get(key), responseMap.get(key));
        return val;
    }
}
