package com.example;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adress {
@Column(name="address_line")
private String addrLine;
@Column(name="city_name")
private String city;
private String state;
private String pincode;
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
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Adress [addrLine=" + addrLine + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
}

}
