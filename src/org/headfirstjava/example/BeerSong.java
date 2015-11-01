package org.headfirstjava.example;

public class BeerSong {
		
	public static void main(String[] args) {
		int bn = 99;
		String string = "If one of those bottles should happen to fall,";
		while (bn > 0) {
			if (bn == 1) {
				System.out.println(bn + " bottles of beer on the wall;\n");
				System.out.println("If the last bottle of beer should happen to fall, what a waste of alcohol!");
				bn = bn - 1;
			}
			else {
				System.out.println(bn + " bottles of beer on the wall;\n");
				System.out.println(string + "\n");
				bn = bn - 1;	
			}
		}
	}			
}
