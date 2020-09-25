package com.animals.bean;

import com.animals.interfaces.Swimmable;
import com.animals.utils.Constants;

public class Fish extends Animal implements Swimmable{
	
	@Override
	public void swim() {
		System.out.println(Constants.I_AM_SWIMMING);
	}
	
	public String bodySize() {
        return null;
    }

    public String bodyColor() {
        return null;
    }
}
