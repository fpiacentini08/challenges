package com.fpiacentini08.challenges.challenge007;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RangeMergeTest {


	@Test
	void givenS1_whenExecute_shouldReturnValidResponse() {
		int[][] s1 = {{3, 9}, {4, 8}, {15, 30}, {13, 25}, {17, 19}};
		var response = RangeMerge.execute(s1);
		var expectedResponse = Arrays.asList(new int[]{3, 9}, new int[]{13, 30}) ;
		assertNotNull(response);
		assertEquals(expectedResponse.size(), response.size());
		for(var array : expectedResponse){
			assertTrue(response.stream().anyMatch(val -> val[0] == array[0] && val[1] == array[1]));
		}
	}

	@Test
	void givenS2_whenExecute_shouldReturnValidResponse() {
		int[][] s2 = {{7, 12}, {3, 5}, {12, 13}, {17, 25}, {15, 25}};
		var response = RangeMerge.execute(s2);
		var expectedResponse = Arrays.asList(new int[]{3, 5}, new int[]{7, 13}, new int[]{15, 25});
		assertNotNull(response);
		assertEquals(expectedResponse.size(), response.size());
		for(var array : expectedResponse){
			assertTrue(response.stream().anyMatch(val -> val[0] == array[0] && val[1] == array[1]));
		}
	}

	@Test
	void givenS3_whenExecute_shouldReturnValidResponse() {
		int[][] s3 = {{2, 3}, {3, 4}, {6, 7}};
		var response = RangeMerge.execute(s3);
		var expectedResponse = Arrays.asList(new int[]{2, 4}, new int[]{6, 7});
		assertNotNull(response);
		assertEquals(expectedResponse.size(), response.size());
		for(var array : expectedResponse){
			assertTrue(response.stream().anyMatch(val -> val[0] == array[0] && val[1] == array[1]));
		}
	}

}
