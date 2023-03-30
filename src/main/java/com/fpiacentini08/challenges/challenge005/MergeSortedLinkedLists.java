package com.fpiacentini08.challenges.challenge005;

import java.util.LinkedList;

public class MergeSortedLinkedLists {

	public static LinkedList<Integer> execute(LinkedList<Integer>[] linkedListsArray) {
		var responseLinkedList = new LinkedList<Integer>();
		for (var linkedList : linkedListsArray) {
			if (responseLinkedList.isEmpty()) {
				responseLinkedList.addAll(linkedList);
			} else {
				responseLinkedList = insertInLinkedListInOrder(linkedList, responseLinkedList);
			}

		}
		return responseLinkedList;
	}

	private static LinkedList<Integer> insertInLinkedListInOrder(LinkedList<Integer> linkedList, LinkedList<Integer> responseLinkedList) {
		int insertingIndex = 0;
		for (var number : linkedList) {
			while (insertingIndex < responseLinkedList.size() && responseLinkedList.get(insertingIndex) < number) {
				insertingIndex++;
			}
			if (insertingIndex < responseLinkedList.size()) {
				responseLinkedList.add(insertingIndex, number);
			} else {
				responseLinkedList.addLast(number);
			}
		}
		return responseLinkedList;
	}
}
