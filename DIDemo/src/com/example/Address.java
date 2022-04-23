package com.example;

public class Address {
private String addrLine,city,state,country;

public Address(String addrLine, String city, String state, String country) {
	super();
	this.addrLine = addrLine;
	this.city = city;
	this.state = state;
	this.country = country;
	
}

@Override
public String toString() {
	return "Address [addrLine=" + addrLine + ", city=" + city + ", state=" + state + ", country=" + country + "]";
}
}
