package orge.tej.javapractice.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import orge.tej.javapractice.messenger.service.MessageService;
import orge.tej.javapractice.messenger.model.Message;

//http://localhost:8080/messanger/webapi/messages
@Path("messages")
public class MessageResource {
	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> retriveAllMessages() {
		return messageService.getMessageList();
	}
}
