package com.fpiacentini08.challenges.challenge003;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenFibonaccisTest {

    @Test
    void givenFibonaccisUpTo144_whenExecute_shouldReturnEvenNumbersFirst(){
        int[] input = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        var result = EvenFibonaccis.returnEvenNumbersFirst(input);
        validateResult(input, result);
    }

    @Test
    void givenFibonaccisUpTo3_whenExecute_shouldReturnEvenNumbersFirst(){
        int[] input = {1, 1, 2, 3};
        var result = EvenFibonaccis.returnEvenNumbersFirst(input);
        validateResult(input, result);
    }

    @Test
    void givenFibonaccisUpTo21_whenExecute_shouldReturnEvenNumbersFirst(){
        int[] input = {1, 1, 2, 3, 5, 8, 13, 21};
        var result = EvenFibonaccis.returnEvenNumbersFirst(input);
        validateResult(input, result);
    }

    @Test
    void givenFibonaccisUpTo34_whenExecute_shouldReturnEvenNumbersFirst(){
        int[] input = {1, 1, 2, 3, 5, 8, 13, 21, 34};
        var result = EvenFibonaccis.returnEvenNumbersFirst(input);
        validateResult(input, result);
    }

    @Test
    void givenFibonaccisUpTo89_whenExecute_shouldReturnEvenNumbersFirst(){
        int[] input = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        var result = EvenFibonaccis.returnEvenNumbersFirst(input);
        validateResult(input, result);
    }

    private void validateResult(int[] input, int[] result){
        assertNotNull(result);
        assertTrue(Arrays.equals(input, result));
        assertEquals(input.length, result.length);
        for(int i = 0; i < result.length / 3 ; i++){
            assertTrue(result[i] % 2 == 0);
        }
        for(int i = result.length / 3 ; i < result.length ; i++){
            assertTrue(result[i] % 2 == 1);
        }
    }
}
