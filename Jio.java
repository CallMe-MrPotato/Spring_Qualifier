package com.entity;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String Calling() {
		return "You are Calling Jio";
	}

}
