package pl.mariuszczarny.model;

public final class Contact {
	private final String header;
	private final String sendSuccessMessage;
	private final String sendFailedMessage;
	private String myEmail;
	private String body;

	public Contact(String header, String sendSuccessMessage, String sendFailedMessage) {
		this.header = header;
		this.sendSuccessMessage = sendSuccessMessage;
		this.sendFailedMessage = sendFailedMessage;
	}

	public synchronized String getMyEmail() {
		return myEmail;
	}

	public synchronized void setMyEmail(String myEmail) {
		this.myEmail = myEmail;
	}

	public synchronized String getBody() {
		return body;
	}

	public synchronized void setBody(String body) {
		this.body = body;
	}

	public synchronized String getHeader() {
		return header;
	}

	public synchronized String getSendSuccessMessage() {
		return sendSuccessMessage;
	}

	public synchronized String getSendFailedMessage() {
		return sendFailedMessage;
	}

	@Override
	public String toString() {
		return "Contact [header=" + header + ", sendSuccessMessage=" + sendSuccessMessage + ", sendFailedMessage="
				+ sendFailedMessage + ", myEmail=" + myEmail + ", body=" + body + "]";
	}

}
