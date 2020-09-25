package com.animals.bean;

import com.animals.enums.SoundEnums;
import com.animals.helper.SingHelper;
import com.animals.utils.Constants;

public class Bird extends Animal{
	
	private SingHelper singHelper;
	
	public void makeSound(String sound) {
	        System.out.println(sound);
	}
	
	public void makeSound() {};
	
	public void walk() {
		 System.out.println(Constants.I_AM_WALKING);
	}
	
	public void fly() {
        System.out.println(Constants.I_AM_FLYING);
    }

    public void swim() {
        System.out.println(Constants.I_AM_SWIMMING);
    }
    
    public Bird() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Bird(SingHelper singHelper) {
        this.singHelper = singHelper;
    }
}
