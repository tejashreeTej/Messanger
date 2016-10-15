package orge.tej.javapractice.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public class Message {

	private long messageId;
	private String message;
	private Date craeted;
	private String auther;

	public Message() {

	}

	public Message(long messageId, String message, String auther) {
		this.messageId = messageId;
		this.message = message;
		this.auther = auther;
		this.craeted = new Date();
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCraeted() {
		return craeted;
	}

	public void setCraeted(Date craeted) {
		this.craeted = craeted;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

}
