package com.epam.java8;

public class Response {

	private String resoonseBody;
	private String responsetype;
	private int statusCode;

	public String getResoonseBody() {
		return resoonseBody;
	}

	public void setResoonseBody(String resoonseBody) {
		this.resoonseBody = resoonseBody;
	}

	public String getResponsetype() {
		return responsetype;
	}

	public void setResponsetype(String responsetype) {
		this.responsetype = responsetype;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Response(String resoonseBody, String responsetype, int statusCode) {
		super();
		this.resoonseBody = resoonseBody;
		this.responsetype = responsetype;
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "Response [resoonseBody=" + resoonseBody + ", responsetype=" + responsetype + ", statusCode="
				+ statusCode + "]";
	}

}
