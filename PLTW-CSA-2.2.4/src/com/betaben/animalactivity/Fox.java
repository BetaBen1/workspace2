package com.betaben.animalactivity;

public class Fox extends Animal implements Fun {

	@Override
	public String say(){
		return("Ring-ding-ding-ding-dingeringeding");
	}
	
	@Override
	public String play(){
		return("The fox chases mice and digs holes.");
	}
	
}
