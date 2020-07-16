package System;

import java.io.Serializable;

public class Person implements Serializable {
	String name,bir,phone, eamil,group,other;
	public Person(String name,String bir, String phone, String eamil, String group, String other){
		this.name = name;
		this.bir = bir;
		this.phone = phone;
		this.eamil = eamil;
		this.group = group;
		this.other = other;
	}
	public String toString(){
		return this.name;
	}

}
