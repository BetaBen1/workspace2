package com.betaben.animalactivity;

public class Fox extends Animal implements Fun, Fly, Swim {

	@Override
	public String say(){
		return("Ring-ding-ding-ding-dingeringeding");
	}
	
	@Override
	public String play(){
		return("The fox chases mice and digs holes.");
	}
	
	@Override
	public String fly(){
		return("The fox can't fly.");
	}
	
	@Override
	public String swim(){
		return("The fox can swim.");
	}
	
}
