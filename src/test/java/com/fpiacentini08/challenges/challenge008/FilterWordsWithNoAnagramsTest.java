package com.fpiacentini08.challenges.challenge008;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterWordsWithNoAnagramsTest {

	@Test
	void givenWordsList1_whenExecute_shouldReturnFilteredList(){
		var input = Arrays.asList("dog", "dog", "cat", "god", "elvis", "lives");
		var expectedOutput = Arrays.asList("dog", "dog", "god", "elvis", "lives");
		var output = FilterWordsWithNoAnagrams.execute(input);
		assertNotNull(output);
		assertEquals(expectedOutput.size(), output.size());
		for(var word : expectedOutput){
			assertTrue(output.stream().anyMatch(val -> val.toLowerCase().equals(word.toLowerCase())));
		}
	}

	@Test
	void givenWordsList2_whenExecute_shouldReturnFilteredList(){
		var input = Arrays.asList("Tom Marvolo Riddle", "I am Lord Voldemort", "oh, lame saint", "the mona lisa", "dirty room", "dormitory");
		var expectedOutput = Arrays.asList("Tom Marvolo Riddle", "I am Lord Voldemort", "oh, lame saint", "the mona lisa", "dirty room", "dormitory");
		var output = FilterWordsWithNoAnagrams.execute(input);
		assertNotNull(output);
		assertEquals(expectedOutput.size(), output.size());
		for(var word : expectedOutput){
			assertTrue(output.stream().anyMatch(val -> val.toLowerCase().equals(word.toLowerCase())));
		}
	}

	@Test
	void givenWordsList3_whenExecute_shouldReturnFilteredList(){
		var input = Arrays.asList("A", "B", "C", "D", "E");
		var output = FilterWordsWithNoAnagrams.execute(input);
		assertNotNull(output);
		assertTrue(output.isEmpty());
	}

	@Test
	void givenWordsList4_whenExecute_shouldReturnFilteredList(){
		var input = Arrays.asList("A", "a");
		var expectedOutput = Arrays.asList("A", "a");
		var output = FilterWordsWithNoAnagrams.execute(input);
		assertNotNull(output);
		assertEquals(expectedOutput.size(), output.size());
		for(var word : expectedOutput){
			assertTrue(output.stream().anyMatch(val -> val.toLowerCase().equals(word.toLowerCase())));
		}
	}


}
