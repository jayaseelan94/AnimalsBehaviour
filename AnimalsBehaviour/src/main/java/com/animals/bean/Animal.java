package com.animals.bean;

public abstract class Animal {
	protected enum Sex {MALE,FEMALE};
	protected Sex sex;
	
	public void setSex(Sex sex){
		this.sex = sex;
	}
	
	public Sex getSex(){
		return sex;
	}
	
}
