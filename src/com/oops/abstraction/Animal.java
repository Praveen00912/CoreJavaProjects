package com.oops.abstraction;

abstract class Animal {

	// concrete method - common behaviour
	void sleep() {
		System.out.println("animal sleeps");
	}
	
	
	//abstract method
	abstract void makeSound();
}
