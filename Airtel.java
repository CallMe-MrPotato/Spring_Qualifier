package com.entity;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim {

	@Override
	public String Calling() {
		return "You are calling Airtel";
	}

}
