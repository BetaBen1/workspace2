package com.betaben.animalactivity;

public class Fish extends Animal implements Fun, Fly, Swim {

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
	
}
