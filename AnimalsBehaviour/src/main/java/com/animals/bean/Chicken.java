package com.animals.bean;

import com.animals.enums.Gender;
import com.animals.enums.SoundEnums;
import com.animals.helper.SingHelper;
import com.animals.interfaces.Speakable;

public class Chicken extends Bird implements Speakable {
	
	//Relation between Rooster and chicken is Same Bread, but different Genders.
    public void canSpeak() {
		if(this.getSex() == Gender.FEMALE)
			System.out.println(SoundEnums.CHICKEN);
		else
			System.out.println(SoundEnums.ROOSTER);
    }
    
    public Chicken() {
        super(new SingHelper(SoundEnums.CHICKEN));
    }

    public Chicken(SingHelper singHelper) {
        super(singHelper);
    }
    
    @Override
    public void makeSound(String sound) {
		super.makeSound(sound);
    }
    
}
