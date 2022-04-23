package com.example.mavenjpaHibernate;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Person1 {
	@Id
private int P_id;
private String name;
private String tech;
public int getP_id() {
	return P_id;
}
public void setP_id(int p_id) {
	this.P_id = p_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
@Override
public String toString() {
	return "Person [P_id=" + P_id + ", name=" + name + ", tech=" + tech + "]";
}

}
