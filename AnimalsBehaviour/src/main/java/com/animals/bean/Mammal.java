package com.animals.bean;

import com.animals.enums.SoundEnums;
import com.animals.helper.SingHelper;
import com.animals.interfaces.Speakable;
import com.animals.interfaces.Walkable;
import com.animals.utils.Constants;


public class Mammal extends Animal implements Walkable,Speakable {
	private SingHelper singHelper;

    public Mammal() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }
    
    public Mammal(SingHelper singHelper) {
        this.singHelper = singHelper;
    }
    
    public void canSpeak() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constants.I_AM_WALKING);
    }
}
