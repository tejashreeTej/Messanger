package orge.tej.javapractice.messenger.service;

import java.util.ArrayList;
import java.util.List;

import orge.tej.javapractice.messenger.model.Message;

public class MessageService {

	public List<Message> getMessageList(){
		List<Message> list=new ArrayList<Message>();
		Message msg1=new Message(1,"Welcome to First message, in REST Web srvice","Tejashree");
		Message msg2=new Message(2,"This is second message, in REST Web srvice Using jersey","Tejashree");
		list.add(msg1);
		list.add(msg2);
		return list;	
	}
}
