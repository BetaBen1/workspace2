package com.betaben.animalactivity;

public class Fish extends Animal implements Fun, Fly, Swim {

	public Fish(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String say() {
		return("blub");
	}
	
	@Override
	public String play(){
		return("The fish likes to play tag.");
	}
	
	@Override
	public String fly(){
		return("Only some fish can fly.");
	}
	
	@Override
	public String swim(){
		return("The fish can swim.");
	}
	
	@Override
	public String getAnimalName() {
		return("fish");
	}
}
