package com.fpiacentini08.challenges.challenge007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RangeMerge {

	public static List<int[]> execute(int[][] input) {
		var solution = new ArrayList<int[]>();

		input = sortArrayOfArraysByFirstMember(input);

		for (int[] array : input) {
			if (solution.isEmpty()) {
				solution.add(array);
			} else {
				var itFitted = false;
				for (int[] solutionArray : new ArrayList<>(solution)) {
					if ((array[0] >= solutionArray[0] && array[0] <= solutionArray[1]) ||
							(array[1] <= solutionArray[0] && array[1] <= solutionArray[1])) {
						solution.remove(solutionArray);
						solution.add(new int[]{
								Math.min(Math.min(array[0], array[1]), Math.min(solutionArray[0], solutionArray[1])),
								Math.max(Math.max(array[0], array[1]), Math.max(solutionArray[0], solutionArray[1]))
						});
						itFitted = true;
						break;
					}
				}
				if (!itFitted) {
					solution.add(array);
				}
			}
		}
		return solution;
	}

	private static int[][] sortArrayOfArraysByFirstMember(int[][] arrayOfArrays) {
		Arrays.sort(arrayOfArrays, Comparator.comparingInt(o -> o[0]));
		return arrayOfArrays;
	}

}
