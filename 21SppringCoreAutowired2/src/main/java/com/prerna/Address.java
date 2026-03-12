package com.prerna;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	private int houseno;
	private String city;
	public Address(@Value("18")int houseno, @Value("Jaipur")String city) {
		super();
		this.houseno = houseno;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + "]";
	}
		
	

}
