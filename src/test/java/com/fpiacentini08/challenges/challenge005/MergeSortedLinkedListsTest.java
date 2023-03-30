package com.fpiacentini08.challenges.challenge005;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortedLinkedListsTest {

	@Test
	void givenEmptyArray_whenExecute_thenShouldReturnEmptyLinkedList() {
		LinkedList<Integer>[] input = Arrays.array();
		var response = MergeSortedLinkedLists.execute(input);
		assertEquals(0, response.size());
		assertTrue(response.isEmpty());
	}

	@Test
	void givenArrayWithEmptyLinkedList_whenExecute_thenShouldReturnEmptyLinkedList() {
		LinkedList<Integer>[] input = Arrays.array(new LinkedList<>());
		var response = MergeSortedLinkedLists.execute(input);
		assertEquals(0, response.size());
		assertTrue(response.isEmpty());
	}

	@Test
	void givenArrayWith1LinkedList_whenExecute_thenShouldReturnTheSameLinkedList() {
		var linkedList = new LinkedList<Integer>();
		linkedList.addLast(1);
		LinkedList<Integer>[] input = Arrays.array(linkedList);
		var response = MergeSortedLinkedLists.execute(input);
		assertEquals(1, response.size());
		assertEquals(1, response.getFirst());
	}

	@Test
	void givenArrayWith2LinkedLists_whenExecute_thenShouldReturnTheMergedLinkedList() {
		var linkedList = new LinkedList<Integer>();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.addLast(3);
		var linkedList2 = new LinkedList<Integer>();
		linkedList2.addLast(3);
		linkedList2.addLast(4);
		linkedList2.addLast(5);
		LinkedList<Integer>[] input = Arrays.array(linkedList, linkedList2);
		var response = MergeSortedLinkedLists.execute(input);
		assertEquals(6, response.size());
		assertTrue(java.util.Arrays.equals(Arrays.array(1, 2, 3, 3, 4, 5), response.toArray()));
	}

	@Test
	void givenArrayWith3LinkedLists_whenExecute_thenShouldReturnTheMergedLinkedList() {
		var linkedList = new LinkedList<Integer>();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.addLast(3);
		var linkedList2 = new LinkedList<Integer>();
		linkedList2.addLast(2);
		linkedList2.addLast(3);
		linkedList2.addLast(7);
		var linkedList3 = new LinkedList<Integer>();
		linkedList3.addLast(1);
		linkedList3.addLast(7);
		linkedList3.addLast(5);
		LinkedList<Integer>[] input = Arrays.array(linkedList, linkedList2, linkedList3);
		var response = MergeSortedLinkedLists.execute(input);
		assertEquals(9, response.size());
		assertTrue(java.util.Arrays.equals(Arrays.array(1, 1, 2, 2, 3, 3, 5, 7, 7), response.toArray()));
	}

	@Test
	void givenArrayWith5LinkedLists_whenExecute_thenShouldReturnTheMergedLinkedList() {
		var linkedList = new LinkedList<Integer>();
		linkedList.addLast(1);
		linkedList.addLast(99);
		var linkedList2 = new LinkedList<Integer>();
		linkedList2.addLast(2);
		linkedList2.addLast(7);
		linkedList2.addLast(16);
		var linkedList3 = new LinkedList<Integer>();
		linkedList3.addLast(1);
		linkedList3.addLast(2);
		linkedList3.addLast(8);
		linkedList3.addLast(17);
		linkedList3.addLast(97);
		var linkedList4 = new LinkedList<Integer>();
		linkedList4.addLast(1);
		linkedList4.addLast(2);
		var linkedList5 = new LinkedList<Integer>();
		linkedList5.addLast(5);
		linkedList5.addLast(8);
		linkedList5.addLast(97);
		linkedList5.addLast(99);
		var linkedList6 = new LinkedList<Integer>();
		LinkedList<Integer>[] input = Arrays.array(linkedList, linkedList2, linkedList3, linkedList4, linkedList5, linkedList6);
		var response = MergeSortedLinkedLists.execute(input);
		assertEquals(16, response.size());
		assertTrue(java.util.Arrays.equals(Arrays.array(1, 1, 1, 2, 2, 2, 5, 7, 8, 8, 16, 17, 97, 97, 99, 99), response.toArray()));
	}

}
