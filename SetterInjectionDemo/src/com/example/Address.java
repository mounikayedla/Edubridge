package com.example;

public class Address {
private String addrLine,city,state,country;

public String getAddrLine() {
	return addrLine;
}

public void setAddrLine(String addrLine) {
	this.addrLine = addrLine;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return "Address [addrLine=" + addrLine + ", city=" + city + ", state=" + state + ", country=" + country + "]";
}

}
