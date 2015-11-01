package org.headfirstjava.example;

//import org.omg.CORBA.PUBLIC_MEMBER;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;		
	}

	public String checkYourself(String stringGuess) {
// convert the userGuess string into an integer guess
		int guess = Integer.parseInt(stringGuess);
		
		String result = "miss";

//		for (int cell :locationCells) {
//			if (guess == cell) {
//				result = "hit";
//				numOfHits ++;
//				cell = -1;
//				break;
//			}
			

//		int[] guessCount = {0,0,0};
		for (int i = 0; i < locationCells.length; i++) {
			if (guess == locationCells[i]) {
					result = "hit";
					numOfHits ++;
					locationCells[i]=-1;
					break;
				}
			}
			
			
		// out of the loop
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);	
		return result;
	}
}
