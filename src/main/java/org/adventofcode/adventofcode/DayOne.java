package org.adventofcode.adventofcode;

public class DayOne {

	public Integer countCharacters(char typeOfCharachterToCount, String stringToCountFrom) {
		Integer numberOfMatches = 0;
		for (int currentCharacter = 0; currentCharacter < stringToCountFrom.length(); currentCharacter++) {
			if (stringToCountFrom.charAt(currentCharacter) == typeOfCharachterToCount) {
				numberOfMatches++;
			}
		}
		return numberOfMatches;
	}
}
