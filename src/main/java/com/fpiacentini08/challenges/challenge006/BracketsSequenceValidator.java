package com.fpiacentini08.challenges.challenge006;

import java.util.HashMap;
import java.util.Stack;

public class BracketsSequenceValidator {

	public static boolean execute(String input){
		var charactersRelated = new HashMap<String, String>();
		charactersRelated.put("(", ")");
		charactersRelated.put("[", "]");
		charactersRelated.put("{", "}");
		var charactersStack = new Stack<String>();
		for(char character : input.toCharArray()){
			if(charactersRelated.keySet().contains(String.valueOf(character))){
				charactersStack.push(String.valueOf(character));
			}
			else{
				if(charactersStack.isEmpty()){
					return false;
				}
				String lastCharacter = charactersStack.pop();
				if(!charactersRelated.get(lastCharacter).equals(String.valueOf(character))){
					return false;
				}
			}
		}
		return charactersStack.isEmpty();
	}
}
