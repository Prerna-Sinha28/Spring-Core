package com.app.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DataBaseConnection {
	
	@Value("${my.db.driver}")
	private String Driver;
	@Value("${my.db.url}")
	private String url;
	@Value("${my.db.username}")
	private String username;
	@Value("${my.dbb.username}")
	private String userpwd;

	@Override
	public String toString() {
		return "DataBaseConnection [Driver=" + Driver + ", url=" + url + ", username=" + username + ", userpwd="
				+ userpwd + "]";
	}
	
	
	

}
