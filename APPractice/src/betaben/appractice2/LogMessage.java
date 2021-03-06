package betaben.appractice2;

public class LogMessage {

	private String machineId;
	private String description;
	
	public LogMessage(String message){
		
		String[] array = message.split(":");
		this.machineId = array[0];
		this.description = array[1];
	}
	
	public boolean containsWord(String keyword){

		return description.contains(keyword)
				&& (description.startsWith(keyword) || description.contains(" " + keyword))
				&& (description.endsWith(keyword) || description.contains(keyword + " "));
		
	}
	
	public String getMachineId(){ return machineId; }
	
	public String getDescription(){ return description; }
	
	
}
