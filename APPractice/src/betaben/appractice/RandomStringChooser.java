package betaben.appractice;

import java.util.ArrayList;
import java.util.Random;

public class RandomStringChooser {

	private ArrayList<String> strings;
	private Random rand;
	
	public RandomStringChooser(String[] array){
		strings = new ArrayList<String>();
		rand = new Random();
		for(String s : array) strings.add(s);
	}
	
	public String getNext(){
		if(strings.size() == 0){
			return "NONE";
		}
		
		String result = strings.get(rand.nextInt(strings.size()));
		strings.remove(result);
		return result;
	}
	
}

