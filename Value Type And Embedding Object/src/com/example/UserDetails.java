package com.example;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User1")
public class UserDetails {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
private int user_id;
@Column(name="user_name")
private String name;
@Embedded
private Adress address;
private String phone;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Adress getAddress() {
	return address;
}
public void setAddress(Adress address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "UserDetails [user_id=" + user_id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
}


}
