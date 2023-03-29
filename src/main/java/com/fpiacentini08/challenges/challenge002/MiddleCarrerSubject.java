package com.fpiacentini08.challenges.challenge002;

import java.util.HashSet;
import java.util.LinkedList;

public class MiddleCarrerSubject {

    public static String getMiddleSubject(String[][] subjectsPrerequisitesList) {
        var subjects = new HashSet<String>();
        for (int i = 0; i < subjectsPrerequisitesList.length; i++) {
            subjects.add(subjectsPrerequisitesList[i][0]);
            subjects.add(subjectsPrerequisitesList[i][1]);
        }
        var carrerLinkedList = new LinkedList<>(subjects);
        for (int i = 0; i < subjectsPrerequisitesList.length; i++) {
            carrerLinkedList.add(carrerLinkedList.indexOf(subjectsPrerequisitesList[i][1]), subjectsPrerequisitesList[i][0]);
        }
        return carrerLinkedList.get(carrerLinkedList.size() / 2);
    }

}
