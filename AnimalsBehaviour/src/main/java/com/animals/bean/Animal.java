package com.animals.bean;

import com.animals.enums.Gender;

public abstract class Animal {
	protected Gender sex;
	
	public void setSex(Gender sex){
		this.sex = sex;
	}
	
	public Gender getSex(){
		return sex;
	}
	
}
