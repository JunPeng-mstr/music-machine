package org.headfirstjava.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class SimpleDotComGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		
		SimpleDotCom sdc = new SimpleDotCom();
		
		int[] locs = {0, 0, 0};
		locs[0] = (int) (Math.random()*5);
		locs[1] = locs[0] + 1;
		locs[2] = locs[1] + 1;
		System.out.println(Arrays.toString(locs));
		
		sdc.setLocationCells(locs);


		while (sdc.numOfHits < 3) {
			System.out.println("Enter a number");
			
			Scanner user_input = new Scanner( System.in );
			String userGuess;
			userGuess = user_input.next( );
			numOfGuesses++;
		
			sdc.checkYourself(userGuess);	
			}

		System.out.println("You took " + numOfGuesses + " guesses");

		}
	}
