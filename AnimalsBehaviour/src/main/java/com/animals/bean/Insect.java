package com.animals.bean;

import com.animals.helper.SingHelper;
import com.animals.interfaces.Flyable;
import com.animals.interfaces.Speakable;
import com.animals.interfaces.Walkable;
import com.animals.utils.Constants;

public class Insect extends Animal implements Flyable {
	
	private SingHelper singHelper;

    public Insect(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void fly() {
        System.out.println(Constants.I_AM_FLYING);
    }

    public void canSpeak() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constants.I_AM_WALKING);
    }
}
