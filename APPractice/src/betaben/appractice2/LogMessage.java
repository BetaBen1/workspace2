package betaben.appractice2;

public class LogMessage {

	private String machineId;
	private String description;
	
	public LogMessage(String message){
		
		String[] array = message.split(":");
		this.machineId = array[0];
		this.description = array[1];
		System.out.println(machineId);
		System.out.println(description);
	}
	
	public boolean containsWord(String keyword){
		
		if(description.startsWith(keyword)){ 
			return true;
		}
		else if(description.startsWith(" " + keyword)){
			return true;
		}
		else if(description.endsWith(keyword)){
			return true;
		}
		else if(description.contentEquals(keyword + " ")){
			return true;
		}
		else{ 
			return false;
		}
		
	}
	
	public String getMachineId(){ return machineId; }
	
	public String getDescription(){ return description; }
	
	
}
