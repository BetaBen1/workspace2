package betaben.appractice2;

public class Main {

	public static void main(String[] args) {

		LogMessage message = new LogMessage("disk:disk");
		message.containsWord("disk");
		SystemLog log = new SystemLog();
		log.removeMessages("disk");
		
	}

}
