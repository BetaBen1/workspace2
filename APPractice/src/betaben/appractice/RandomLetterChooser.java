package betaben.appractice;

public class RandomLetterChooser extends RandomStringChooser {

	public RandomLetterChooser(String str){
		super(getSingleLetters(str));
	}
	
	public static String[] getSingleLetters(String str){
		String[] array = new String[str.length()];
		for(int i = 0; i < array.length; i++){
			array[i] = String.valueOf(str.charAt(i));
		}
		return array;
	}
	
}
