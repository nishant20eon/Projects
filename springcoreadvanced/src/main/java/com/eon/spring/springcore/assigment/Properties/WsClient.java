package com.eon.spring.springcore.assigment.Properties;

public class WsClient {
	private String url;
	private String username;
	private String password;

	public WsClient(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "WsClient [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
