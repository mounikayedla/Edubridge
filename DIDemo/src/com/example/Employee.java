package com.example;

public class Employee {
private int id;
private String name;
private Address addr;

public Employee(int id,String name){
	super();
	this.id =id;
	this.name=name;
}
public Employee(int id,String name,Address addr){
	super();
	this.id =id;
	this.name=name;
this.addr=addr;

}
void show(){
	System.out.println("Id: " +id+ "Name:"+name);
	System.out.println("Address:" +addr);
}




}
