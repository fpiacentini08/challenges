package com.fpiacentini08.challenges.challenge006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketsSequenceValidatorTest {
	@Test
	void givenEmptyString_whenExecute_shouldReturnTrue(){
		var input = "";
		boolean isValid = BracketsSequenceValidator.execute(input);
		assertTrue(isValid);
	}

	@Test
	void givenS1_whenExecute_shouldReturnTrue(){
		var input = "()[]{}";
		boolean isValid = BracketsSequenceValidator.execute(input);
		assertTrue(isValid);
	}

	@Test
	void givenS2_whenExecute_shouldReturnTrue(){
		var input = "({})";
		boolean isValid = BracketsSequenceValidator.execute(input);
		assertTrue(isValid);
	}

	@Test
	void givenS3_whenExecute_shouldReturnFalse(){
		var input = "([)]";
		boolean isValid = BracketsSequenceValidator.execute(input);
		assertFalse(isValid);
	}

	@Test
	void givenS4_whenExecute_shouldReturnFalse(){
		var input = "([]";
		boolean isValid = BracketsSequenceValidator.execute(input);
		assertFalse(isValid);
	}

	@Test
	void givenS5_whenExecute_shouldReturnTrue(){
		var input = "({[[{}(())]{[]}][]})";
		boolean isValid = BracketsSequenceValidator.execute(input);
		assertTrue(isValid);
	}

	@Test
	void givenS6_whenExecute_shouldReturnFalse(){
		var input = "()]]}";
		boolean isValid = BracketsSequenceValidator.execute(input);
		assertFalse(isValid);
	}


}
