package com.fpiacentini08.challenges.challenge008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterWordsWithNoAnagrams {

	private static Map<String, char[]> normalizedStringsCache = new HashMap<>();

	public static List<String> execute(List<String> inputList) {
		var doesNotHaveAnagram = new HashSet<String>();
		var hasAnagram = new ArrayList<String>();
		for (String word : inputList) {
			var matchingWords = doesNotHaveAnagram.stream().filter(value -> areAnAnagram(value, word)).collect(Collectors.toList());
			if (matchingWords.isEmpty()) {
				if (hasAnagram.stream().anyMatch(value -> areAnAnagram(value, word))) {
					hasAnagram.add(word);
				} else {
					doesNotHaveAnagram.add(word);
				}
			} else {
				hasAnagram.add(word);
				hasAnagram.addAll(matchingWords);
				doesNotHaveAnagram.removeAll(matchingWords);
			}
		}
		return hasAnagram;

	}

	private static boolean areAnAnagram(String word1, String word2) {
		normalizedStringsCache.computeIfAbsent(word1, key -> normalizeString(key));
		normalizedStringsCache.computeIfAbsent(word2, key -> normalizeString(key));
		return Arrays.equals(normalizedStringsCache.get(word1), normalizedStringsCache.get(word2));
	}

	private static char[] normalizeString(String word) {
		var wordAsArray = word.toLowerCase().replaceAll(" ", "").replaceAll("[^a-zA-Z]", "").toCharArray();
		Arrays.sort(wordAsArray);
		return wordAsArray;
	}

}
