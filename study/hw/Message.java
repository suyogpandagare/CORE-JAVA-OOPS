package study.hw;

public class Message {

	private String senderName;
	private String receiverName;
	private String message;
	private Address receiverAddress;

	public Message()
	{

	}

	public Message(String senderName, String receiverName, String message, Address receiverAddress) {

		this.senderName = senderName;
		this.receiverName = receiverName;
		this.message = message;
		this.receiverAddress = receiverAddress;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Address getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(Address receiverAddress) {
		this.receiverAddress = receiverAddress;
	}


}
