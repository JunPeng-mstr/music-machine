package org.headfirstjava.example;

public class Dog {
	String name;
	
	public static void main(String[] args) {
		// make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		// now make a Dog array
		Dog[] myDogs = new Dog[3];
		// and put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//new access the Dogs using the array
		//references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		//Hmmm... what is myDogs[2] name?
		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		// now loop through the array
		//and tell all dogs to bark
		
		int x = 0;
		while (x < myDogs.length) {
			System.out.println(x);
			myDogs[x].bark();
			x = x + 1;
		}
	}
	
	private void bark() {
		if (name != null) {
			System.out.println(name + " says Ruff!");		
		}
	}
	
}
