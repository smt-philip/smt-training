package com.mann.philip.training.headfirst.chapter2.dogsExcercise;

public class Dog {
	
	// initialized a string variable called name
	String name;
	
	public static void main(String[] args) {
		
		// creating a Dog object and accessing it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Ozzy";
		
		// creating a Dog array with a length of 3
		Dog[] myDogs = new Dog[3];
		// adding some dogs to a dog array
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		// accessing the Dogs using the array references
		myDogs[0].name = "Gronk";
		myDogs[1].name = "Jasper";
		
		System.out.println("Last dog's name is: " + myDogs[2].name);
		
		// looping through myDogs array, and telling all of them to bark();
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
		
	}
	
	public void bark() {
		// without the if statement, name == null before the loop starts and will print as null as barking
		if (name != null) {
			System.out.println(name + " says: RUFF! RUFF!");			
		}
	}
	
}
