package com.prerna;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	@Value("111")
	private int houseno;
	@Value("Jaipur")
	private String city;
	
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + "]";
	}
		
	

}
