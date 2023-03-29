package com.fpiacentini08.challenges.challenge003;


public class EvenFibonaccis {

    public static int[] returnEvenNumbersFirst(int[] input){
        int index = 0;
        for(int evenNumberPosition = 2; evenNumberPosition < input.length ; evenNumberPosition+=3 ){
            int evenNumber = input[evenNumberPosition];
            int numberToSwap = input[index];
            input[index] = evenNumber;
            input[evenNumberPosition] = numberToSwap;
            while(input[index] % 2 == 0){
                index++;
            }
        }
        return input;
    }
}
