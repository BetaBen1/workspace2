package com.betaben.animalactivity;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static JLabel display = new JLabel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck duck = new Duck();
		Fish fish = new Fish();
		Seal seal = new Seal();
		Fox fox = new Fox();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(duck);
		animals.add(fish);
		animals.add(seal);
		animals.add(fox);
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setSize(620, 250);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		display.setBounds(0, 100, frame.getWidth(), 100);
		display.setFont(new Font("SF Mono", Font.PLAIN, 36));
		display.setVisible(true);
		
		for(Animal animal : animals){
			frame.add(animal.getButton());
		}
		
		frame.add(display);
		
		frame.setVisible(true);
		
	}

}
