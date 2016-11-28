package com.betaben.animalactivity;

public class Duck extends Animal implements Fun, Fly, Swim {

	public Duck(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String say() {
		return("quack");
	}
	
	@Override
	public String play() {
		return("The duck likes to eat bread.");
	}
	
	@Override
	public String fly(){
		return("The duck can fly.");
	}
	
	@Override
	public String swim(){
		return("The duck can swim.");
	}
	
	@Override
	public String getAnimalName() {
		return ("duck");
	}
	
}
