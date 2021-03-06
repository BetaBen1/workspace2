package betaben.appractice2;

import java.util.ArrayList;
import java.util.List;

public class SystemLog {

	private List<LogMessage> messageList;
	private ArrayList<LogMessage> deletedMessageList = new ArrayList<LogMessage>();
	private ArrayList<LogMessage> theLog = new ArrayList<LogMessage>();

	public List<LogMessage> removeMessages(String keyword){
		
		theLog.add(new LogMessage("CLIENT3:security alert - repeated login failures"));
		theLog.add(new LogMessage("Webserver: disk offline"));
		theLog.add(new LogMessage("SERVER1: file not found"));
		theLog.add(new LogMessage("SERVER2:read error on disk DSK1"));
		theLog.add(new LogMessage("SERVER1:write error on disk DSK2"));
		theLog.add(new LogMessage("Webserver: error on /dev/disk"));
		
		this.messageList = theLog;
		
		for(int i = 0; i < theLog.size(); i++){
			if(theLog.get(i).containsWord(keyword)){
				deletedMessageList.add(theLog.get(i));
				messageList.remove(i);
			}
		}
		
		System.out.println("Messages Left:\n\n");
		
		for(LogMessage messages : messageList){
			System.out.println(messages.getMachineId() + ":" + messages.getDescription());
		}
		
		System.out.println("\n\nDeleted Messages:\n\n");
		
		for(LogMessage messages : deletedMessageList){
			System.out.println(messages.getMachineId() + ":" + messages.getDescription());
		}
		
		return messageList;
	}
	
}