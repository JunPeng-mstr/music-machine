package org.headfirstjava.example;

import java.util.Scanner;

public class scrapcode {
	
	    public static void main(String[] args) {
	    	int classNum = 3;
	    	int stuNum = 4;
	    	double sum = 0;
	    	double avg = 0;
	    	
	    	//input a student's score
	    	int i;
	    	for (i=1;i<=classNum;i++){
	    		System.out.println("Enter the score of student in class " + i);
	    		for (int j = 1; j <= stuNum; j++) {
	    			System.out.println("Enter the score of student " + j + " in class " + i);
	    			Scanner user_input = new Scanner(System.in);
	    			int score = user_input.nextInt();
	    			sum = sum + score;
	    			avg = sum / stuNum;
	    		
	    			if(j == stuNum ){	
	    			System.out.println("Sum score of class " + i + " is: " + sum);
	    			System.out.println("Avg score of class " + i + " is: " + avg);
	    			sum = 0;
	    			avg = 0;
	    			break;
	    			}
				}
	    	}
	    }
}
	    	
	    	