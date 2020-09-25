package com.animals.bean;

import com.animals.utils.Constants;

public class Bird extends Animal{
	
	public void makeSound(String sound) {
	        System.out.println(sound);
	}
	
	public void walk() {
		 System.out.println(Constants.I_AM_WALKING);
	}
	
	public void fly() {
        System.out.println(Constants.I_AM_FLYING);
    }

    public void swim() {
        System.out.println(Constants.I_AM_SWIMMING);
    }
}
