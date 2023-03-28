package com.fpiacentini08.challenges.subjectsincommon;

import java.util.*;
import java.util.stream.Collectors;

public class SubjectsInCommon {

    public static Map<Set<String>, Set<String>> execute(String[][] listOfStudentsAndSubjects){
        var subjectsPerStudentMap = new HashMap<String, Set<String>>();
        for(int i = 0; i < listOfStudentsAndSubjects.length ; i++){
            var student = listOfStudentsAndSubjects[i][0];
            var subject = listOfStudentsAndSubjects[i][1];
            subjectsPerStudentMap.computeIfPresent(student, (key, val) -> addToSetAndReturn(val, subject));
            subjectsPerStudentMap.computeIfAbsent(student, key -> Set.of(subject));
        }
        var response = new HashMap<Set<String>, Set<String>>();
        var studentsQueue = new PriorityQueue<>(subjectsPerStudentMap.keySet());
        var studentToMatch = studentsQueue.poll();
        while(studentToMatch != null){
            for(var secondStudent : studentsQueue.toArray()){
                Set<String> studentsSet = new HashSet<>();
                studentsSet.add(studentToMatch);
                studentsSet.add((String)secondStudent);
                var studentToMatchSubjects = subjectsPerStudentMap.get(studentToMatch);
                var secondStudentSubjects = subjectsPerStudentMap.get(secondStudent);
                var matchingSubjects = studentToMatchSubjects.stream().filter(secondStudentSubjects::contains).collect(Collectors.toList());
                response.computeIfAbsent(studentsSet, key -> new HashSet<>(matchingSubjects));
            }
            studentToMatch = studentsQueue.poll();
        }
        return response;
    }

    private static Set<String> addToSetAndReturn(Set<String> set, String value){
        var response = new HashSet<>(set);
        response.add(value);
        return response;
    }
}