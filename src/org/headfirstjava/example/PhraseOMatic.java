package org.headfirstjava.example;

public class PhraseOMatic {
	public static void main (String[] args){
		
		//make three sets of words to choose from. Add your ownQ
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "Automation", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box","promising", "instant", "long-term", "commited" };
		String[] wordListThree = {"process", "tipping-point", "solution", "game-changer", "mindset", "space", "vision", "mission", "paradigm", "architecture", "interview","offer", "raise", "career", "business"};
		
		//find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		//now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		
		//print out the phrase
		System.out.println("What we need is a " + phrase);
	}
}
