package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eobj")
public class EmailConfig {
	@Value("gmail")
	private String host;
	@Value("111")
	private Integer port;
	public EmailConfig() {
		super();
	}
	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + "]";
	}
	
	
}
