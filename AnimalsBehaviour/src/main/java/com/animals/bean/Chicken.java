package com.animals.bean;

import com.animals.interfaces.Speakable;
import com.animals.utils.Constants;
import com.animals.utils.SoundUtil;

public class Chicken extends Bird implements Speakable {
	
	//Relation between Rooster and chicken is Same Bread, but different Genders.
    public void canSpeak() {
		if(this.getSex() == Sex.FEMALE)
			System.out.println(SoundUtil.Chicken_Says);
		else
			System.out.println(SoundUtil.Rooster_Says);
    }
    
    @Override
    public void makeSound(String sound) {
		super.makeSound(sound);
    }
    
}
